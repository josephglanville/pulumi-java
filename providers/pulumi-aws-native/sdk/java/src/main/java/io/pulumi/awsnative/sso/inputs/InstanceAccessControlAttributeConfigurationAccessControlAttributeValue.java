// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sso.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstanceAccessControlAttributeConfigurationAccessControlAttributeValue extends io.pulumi.resources.InvokeArgs {

    public static final InstanceAccessControlAttributeConfigurationAccessControlAttributeValue Empty = new InstanceAccessControlAttributeConfigurationAccessControlAttributeValue();

    @InputImport(name="source", required=true)
      private final List<String> source;

    public List<String> getSource() {
        return this.source;
    }

    public InstanceAccessControlAttributeConfigurationAccessControlAttributeValue(List<String> source) {
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private InstanceAccessControlAttributeConfigurationAccessControlAttributeValue() {
        this.source = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> source;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceAccessControlAttributeConfigurationAccessControlAttributeValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder setSource(List<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public InstanceAccessControlAttributeConfigurationAccessControlAttributeValue build() {
            return new InstanceAccessControlAttributeConfigurationAccessControlAttributeValue(source);
        }
    }
}
