// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.outputs;

import io.pulumi.aws.apigateway.outputs.UsagePlanApiStageThrottle;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class UsagePlanApiStage {
    /**
     * API Id of the associated API stage in a usage plan.
     * 
     */
    private final String apiId;
    /**
     * API stage name of the associated API stage in a usage plan.
     * 
     */
    private final String stage;
    /**
     * The throttling limits of the usage plan.
     * 
     */
    private final @Nullable List<UsagePlanApiStageThrottle> throttles;

    @OutputCustomType.Constructor
    private UsagePlanApiStage(
        @OutputCustomType.Parameter("apiId") String apiId,
        @OutputCustomType.Parameter("stage") String stage,
        @OutputCustomType.Parameter("throttles") @Nullable List<UsagePlanApiStageThrottle> throttles) {
        this.apiId = apiId;
        this.stage = stage;
        this.throttles = throttles;
    }

    /**
     * API Id of the associated API stage in a usage plan.
     * 
    */
    public String getApiId() {
        return this.apiId;
    }
    /**
     * API stage name of the associated API stage in a usage plan.
     * 
    */
    public String getStage() {
        return this.stage;
    }
    /**
     * The throttling limits of the usage plan.
     * 
    */
    public List<UsagePlanApiStageThrottle> getThrottles() {
        return this.throttles == null ? List.of() : this.throttles;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanApiStage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String stage;
        private @Nullable List<UsagePlanApiStageThrottle> throttles;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanApiStage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.stage = defaults.stage;
    	      this.throttles = defaults.throttles;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }

        public Builder setThrottles(@Nullable List<UsagePlanApiStageThrottle> throttles) {
            this.throttles = throttles;
            return this;
        }
        public UsagePlanApiStage build() {
            return new UsagePlanApiStage(apiId, stage, throttles);
        }
    }
}
