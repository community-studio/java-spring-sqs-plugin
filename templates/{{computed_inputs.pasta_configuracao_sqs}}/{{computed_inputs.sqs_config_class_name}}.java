package {{computed_inputs.pacote_configuracao_sqs}};

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;

import java.net.URI;

@Configuration
public class {{computed_inputs.sqs_config_class_name}} {

    private final {{computed_inputs.aws_config_class_name}} awsConfiguration;

    public SqsConfiguration({{computed_inputs.aws_config_class_name}} awsConfiguration) {
        this.awsConfiguration = awsConfiguration;
    }


    @Bean
    public SqsAsyncClient sqsAsyncClient() {
        return SqsAsyncClient.builder()
                .region(Region.of(awsConfiguration.getRegion()))
                .endpointOverride(URI.create("http://localhost:4566"))
                .credentialsProvider(this.awsCredentialsProvider())
                .build();
    }


    private AwsCredentialsProvider awsCredentialsProvider() {
        return StaticCredentialsProvider.create(AwsBasicCredentials
                .create(awsConfiguration.getAccessKey(), awsConfiguration.getSecretKey()));


    }
}
