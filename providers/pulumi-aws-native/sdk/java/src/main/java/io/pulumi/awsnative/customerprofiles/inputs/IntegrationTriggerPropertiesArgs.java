// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.IntegrationScheduledTriggerPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationTriggerPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationTriggerPropertiesArgs Empty = new IntegrationTriggerPropertiesArgs();

    @InputImport(name="scheduled")
      private final @Nullable Input<IntegrationScheduledTriggerPropertiesArgs> scheduled;

    public Input<IntegrationScheduledTriggerPropertiesArgs> getScheduled() {
        return this.scheduled == null ? Input.empty() : this.scheduled;
    }

    public IntegrationTriggerPropertiesArgs(@Nullable Input<IntegrationScheduledTriggerPropertiesArgs> scheduled) {
        this.scheduled = scheduled;
    }

    private IntegrationTriggerPropertiesArgs() {
        this.scheduled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationTriggerPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationScheduledTriggerPropertiesArgs> scheduled;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationTriggerPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scheduled = defaults.scheduled;
        }

        public Builder setScheduled(@Nullable Input<IntegrationScheduledTriggerPropertiesArgs> scheduled) {
            this.scheduled = scheduled;
            return this;
        }

        public Builder setScheduled(@Nullable IntegrationScheduledTriggerPropertiesArgs scheduled) {
            this.scheduled = Input.ofNullable(scheduled);
            return this;
        }
        public IntegrationTriggerPropertiesArgs build() {
            return new IntegrationTriggerPropertiesArgs(scheduled);
        }
    }
}
