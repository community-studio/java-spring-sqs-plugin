package {{computed_inputs.pacote_configuracao_sqs}};

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class {{computed_inputs.aws_config_class_name}} {

    @Value(value = "${aws.region}")
    private String region;

    @Value(value = "${aws.access-key}")
    public String accessKey ;

    @Value(value = "${aws.secret-key}")
    private String secretKey;

    @Value(value = "${aws.sqs.process-order-queue}")
    private String processOrderQueueUrl ;

}