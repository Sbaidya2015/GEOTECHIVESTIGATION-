package geotechnicalapp.geotech.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.util.SerializationUtils;

import java.util.Map;

public class GeoTechUtility {

    public static <W> StringBuffer processClobData(W clob) {
        StringBuffer stringBuffer = new StringBuffer();
        if (clob instanceof String) {
            stringBuffer.append(clob);
        } else if (clob instanceof Map<?, ?>) {
            stringBuffer.append(new JsonUtility().transformJavaObjectIntoJson(clob, null));
        } else {
            stringBuffer.append(new String(SerializationUtils.serialize(clob)));
        }

        return stringBuffer;
    }

    public static class JsonUtility {

        @SneakyThrows
        public <T> String transformJavaObjectIntoJson(T javaObject, Map<Object, Object> configMap) {
            return new ObjectMapper().writeValueAsString(javaObject);
        }

    }

}
