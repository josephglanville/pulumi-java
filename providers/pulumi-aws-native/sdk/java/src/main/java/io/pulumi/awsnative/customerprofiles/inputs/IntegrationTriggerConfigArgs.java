// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.enums.IntegrationTriggerType;
import io.pulumi.awsnative.customerprofiles.inputs.IntegrationTriggerPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationTriggerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationTriggerConfigArgs Empty = new IntegrationTriggerConfigArgs();

    @Import(name="triggerProperties")
      private final @Nullable Output<IntegrationTriggerPropertiesArgs> triggerProperties;

    public Output<IntegrationTriggerPropertiesArgs> getTriggerProperties() {
        return this.triggerProperties == null ? Output.empty() : this.triggerProperties;
    }

    @Import(name="triggerType", required=true)
      private final Output<IntegrationTriggerType> triggerType;

    public Output<IntegrationTriggerType> getTriggerType() {
        return this.triggerType;
    }

    public IntegrationTriggerConfigArgs(
        @Nullable Output<IntegrationTriggerPropertiesArgs> triggerProperties,
        Output<IntegrationTriggerType> triggerType) {
        this.triggerProperties = triggerProperties;
        this.triggerType = Objects.requireNonNull(triggerType, "expected parameter 'triggerType' to be non-null");
    }

    private IntegrationTriggerConfigArgs() {
        this.triggerProperties = Output.empty();
        this.triggerType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTriggerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IntegrationTriggerPropertiesArgs> triggerProperties;
        private Output<IntegrationTriggerType> triggerType;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTriggerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.triggerProperties = defaults.triggerProperties;
    	      this.triggerType = defaults.triggerType;
        }

        public Builder triggerProperties(@Nullable Output<IntegrationTriggerPropertiesArgs> triggerProperties) {
            this.triggerProperties = triggerProperties;
            return this;
        }
        public Builder triggerProperties(@Nullable IntegrationTriggerPropertiesArgs triggerProperties) {
            this.triggerProperties = Output.ofNullable(triggerProperties);
            return this;
        }
        public Builder triggerType(Output<IntegrationTriggerType> triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }
        public Builder triggerType(IntegrationTriggerType triggerType) {
            this.triggerType = Output.of(Objects.requireNonNull(triggerType));
            return this;
        }        public IntegrationTriggerConfigArgs build() {
            return new IntegrationTriggerConfigArgs(triggerProperties, triggerType);
        }
    }
}
