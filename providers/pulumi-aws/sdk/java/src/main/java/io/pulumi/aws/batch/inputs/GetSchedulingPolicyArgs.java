// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSchedulingPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSchedulingPolicyArgs Empty = new GetSchedulingPolicyArgs();

    /**
     * The Amazon Resource Name (ARN) of the scheduling policy.
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetSchedulingPolicyArgs(
        String arn,
        @Nullable Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.tags = tags;
    }

    private GetSchedulingPolicyArgs() {
        this.arn = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetSchedulingPolicyArgs build() {
            return new GetSchedulingPolicyArgs(arn, tags);
        }
    }
}
