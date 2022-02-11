// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.LimitedPriorityLevelConfigurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PriorityLevelConfigurationSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationSpecArgs Empty = new PriorityLevelConfigurationSpecArgs();

    @InputImport(name="limited")
    private final @Nullable Input<LimitedPriorityLevelConfigurationArgs> limited;

    public Input<LimitedPriorityLevelConfigurationArgs> getLimited() {
        return this.limited == null ? Input.empty() : this.limited;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public PriorityLevelConfigurationSpecArgs(
        @Nullable Input<LimitedPriorityLevelConfigurationArgs> limited,
        Input<String> type) {
        this.limited = limited;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PriorityLevelConfigurationSpecArgs() {
        this.limited = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LimitedPriorityLevelConfigurationArgs> limited;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limited = defaults.limited;
    	      this.type = defaults.type;
        }

        public Builder setLimited(@Nullable Input<LimitedPriorityLevelConfigurationArgs> limited) {
            this.limited = limited;
            return this;
        }

        public Builder setLimited(@Nullable LimitedPriorityLevelConfigurationArgs limited) {
            this.limited = Input.ofNullable(limited);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public PriorityLevelConfigurationSpecArgs build() {
            return new PriorityLevelConfigurationSpecArgs(limited, type);
        }
    }
}
