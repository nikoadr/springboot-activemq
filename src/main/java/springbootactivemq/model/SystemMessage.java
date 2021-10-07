package springbootactivemq.model;

import java.io.Serializable;

/**
 * @author Niko Andrian on 10/7/2021
 * @project springboot-activemq
 */
public class SystemMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String source;
    private String message;

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "SystemMessage{" +
                "source='" +source +'\''+
                ", message='" + message + '\'' +
                '}';
    }
}
