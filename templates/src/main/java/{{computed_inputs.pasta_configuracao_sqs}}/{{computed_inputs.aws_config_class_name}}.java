package {{computed_inputs.pacote_configuracao_sqs}};

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class {{computed_inputs.aws_config_class_name}} {

    private String region = "sa-east-1";

    public String accessKey = "teste";

    private String secretKey = "teste";

    private String exampleQueueUrl = "http://localhost:4566/000000000000/exampleQueueUrl";

}