// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowSalesforceSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSalesforceSourcePropertiesArgs Empty = new FlowSalesforceSourcePropertiesArgs();

    @Import(name="enableDynamicFieldUpdate")
      private final @Nullable Output<Boolean> enableDynamicFieldUpdate;

    public Output<Boolean> getEnableDynamicFieldUpdate() {
        return this.enableDynamicFieldUpdate == null ? Output.empty() : this.enableDynamicFieldUpdate;
    }

    @Import(name="includeDeletedRecords")
      private final @Nullable Output<Boolean> includeDeletedRecords;

    public Output<Boolean> getIncludeDeletedRecords() {
        return this.includeDeletedRecords == null ? Output.empty() : this.includeDeletedRecords;
    }

    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> getObject() {
        return this.object;
    }

    public FlowSalesforceSourcePropertiesArgs(
        @Nullable Output<Boolean> enableDynamicFieldUpdate,
        @Nullable Output<Boolean> includeDeletedRecords,
        Output<String> object) {
        this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
        this.includeDeletedRecords = includeDeletedRecords;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private FlowSalesforceSourcePropertiesArgs() {
        this.enableDynamicFieldUpdate = Output.empty();
        this.includeDeletedRecords = Output.empty();
        this.object = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSalesforceSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enableDynamicFieldUpdate;
        private @Nullable Output<Boolean> includeDeletedRecords;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSalesforceSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDynamicFieldUpdate = defaults.enableDynamicFieldUpdate;
    	      this.includeDeletedRecords = defaults.includeDeletedRecords;
    	      this.object = defaults.object;
        }

        public Builder enableDynamicFieldUpdate(@Nullable Output<Boolean> enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = enableDynamicFieldUpdate;
            return this;
        }
        public Builder enableDynamicFieldUpdate(@Nullable Boolean enableDynamicFieldUpdate) {
            this.enableDynamicFieldUpdate = Output.ofNullable(enableDynamicFieldUpdate);
            return this;
        }
        public Builder includeDeletedRecords(@Nullable Output<Boolean> includeDeletedRecords) {
            this.includeDeletedRecords = includeDeletedRecords;
            return this;
        }
        public Builder includeDeletedRecords(@Nullable Boolean includeDeletedRecords) {
            this.includeDeletedRecords = Output.ofNullable(includeDeletedRecords);
            return this;
        }
        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public FlowSalesforceSourcePropertiesArgs build() {
            return new FlowSalesforceSourcePropertiesArgs(enableDynamicFieldUpdate, includeDeletedRecords, object);
        }
    }
}
