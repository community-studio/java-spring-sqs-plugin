package {{computed_inputs.pasta_producer_sqs}};

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sqs.SqsAsyncClient;

@Service
@RequiredArgsConstructor
public class {{computed_inputs.sqs_produtor_class_name}} {

    private final SqsAsyncClient sqsAsyncClient;

}
