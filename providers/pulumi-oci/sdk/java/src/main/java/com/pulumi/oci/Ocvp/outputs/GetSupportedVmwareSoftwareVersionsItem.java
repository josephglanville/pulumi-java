// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ocvp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSupportedVmwareSoftwareVersionsItem {
    /**
     * @return A description of the software in the bundle.
     * 
     */
    private final String description;
    /**
     * @return A short, unique string that identifies the version of bundled software.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetSupportedVmwareSoftwareVersionsItem(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("version") String version) {
        this.description = description;
        this.version = version;
    }

    /**
     * @return A description of the software in the bundle.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return A short, unique string that identifies the version of bundled software.
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSupportedVmwareSoftwareVersionsItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSupportedVmwareSoftwareVersionsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.version = defaults.version;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetSupportedVmwareSoftwareVersionsItem build() {
            return new GetSupportedVmwareSoftwareVersionsItem(description, version);
        }
    }
}
