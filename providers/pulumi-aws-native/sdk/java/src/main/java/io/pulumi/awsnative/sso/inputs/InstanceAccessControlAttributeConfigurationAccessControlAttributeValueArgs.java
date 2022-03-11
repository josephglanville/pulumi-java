// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs Empty = new InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs();

    @InputImport(name="source", required=true)
      private final Output<List<String>> source;

    public Output<List<String>> getSource() {
        return this.source;
    }

    public InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs(Output<List<String>> source) {
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs() {
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder source(Output<List<String>> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(List<String> source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttributeValueArgs(source);
        }
    }
}
