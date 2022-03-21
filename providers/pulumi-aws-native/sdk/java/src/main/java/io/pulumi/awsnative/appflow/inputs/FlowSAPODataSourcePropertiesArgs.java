// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlowSAPODataSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowSAPODataSourcePropertiesArgs Empty = new FlowSAPODataSourcePropertiesArgs();

    @Import(name="objectPath", required=true)
      private final Output<String> objectPath;

    public Output<String> getObjectPath() {
        return this.objectPath;
    }

    public FlowSAPODataSourcePropertiesArgs(Output<String> objectPath) {
        this.objectPath = Objects.requireNonNull(objectPath, "expected parameter 'objectPath' to be non-null");
    }

    private FlowSAPODataSourcePropertiesArgs() {
        this.objectPath = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSAPODataSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> objectPath;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSAPODataSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectPath = defaults.objectPath;
        }

        public Builder objectPath(Output<String> objectPath) {
            this.objectPath = Objects.requireNonNull(objectPath);
            return this;
        }
        public Builder objectPath(String objectPath) {
            this.objectPath = Output.of(Objects.requireNonNull(objectPath));
            return this;
        }        public FlowSAPODataSourcePropertiesArgs build() {
            return new FlowSAPODataSourcePropertiesArgs(objectPath);
        }
    }
}
