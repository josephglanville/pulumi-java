// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.OSPolicyResourceFileResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OSPolicyResourcePackageResourceMSIResponse {
    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
     */
    private final List<String> properties;
    /**
     * The MSI package.
     * 
     */
    private final OSPolicyResourceFileResponse source;

    @CustomType.Constructor
    private OSPolicyResourcePackageResourceMSIResponse(
        @CustomType.Parameter("properties") List<String> properties,
        @CustomType.Parameter("source") OSPolicyResourceFileResponse source) {
        this.properties = properties;
        this.source = source;
    }

    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
    */
    public List<String> getProperties() {
        return this.properties;
    }
    /**
     * The MSI package.
     * 
    */
    public OSPolicyResourceFileResponse getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> properties;
        private OSPolicyResourceFileResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceMSIResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.source = defaults.source;
        }

        public Builder properties(List<String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(String... properties) {
            return properties(List.of(properties));
        }
        public Builder source(OSPolicyResourceFileResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public OSPolicyResourcePackageResourceMSIResponse build() {
            return new OSPolicyResourcePackageResourceMSIResponse(properties, source);
        }
    }
}
