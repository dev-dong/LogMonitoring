package hello.advanced;

import hello.advanced.trace.logtrace.FieldLogTrace;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        // singleton으로 등록 -> 1개의 instance가 등록된다.
//        return new FieldLogTrace();

        // 기존의 LogTrace가 인터페이스므로 구현체인 ThreadLocalLogTrace로 변경하면 OCP 원칙을 지키면서 v3는 ThreadLocalLogTrace 구현체를 사용한다.
        return new ThreadLocalLogTrace();
    }
}
