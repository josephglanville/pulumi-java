// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.apiregistration.k8s.io_v1.inputs.APIServiceConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * APIServiceStatus contains derived information about an API server
 * 
 */
public final class APIServiceStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final APIServiceStatusArgs Empty = new APIServiceStatusArgs();

    /**
     * Current service state of apiService.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<APIServiceConditionArgs>> conditions;

    public Output<List<APIServiceConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    public APIServiceStatusArgs(@Nullable Output<List<APIServiceConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private APIServiceStatusArgs() {
        this.conditions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(APIServiceStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<APIServiceConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(APIServiceStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder conditions(@Nullable Output<List<APIServiceConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<APIServiceConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }
        public Builder conditions(APIServiceConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }        public APIServiceStatusArgs build() {
            return new APIServiceStatusArgs(conditions);
        }
    }
}
