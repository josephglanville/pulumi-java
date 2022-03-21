// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataflow_v1b3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PackageResponse {
    /**
     * The resource to read the package from. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket} bucket.storage.googleapis.com/
     * 
     */
    private final String location;
    /**
     * The name of the package.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private PackageResponse(
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name) {
        this.location = location;
        this.name = name;
    }

    /**
     * The resource to read the package from. The supported resource type is: Google Cloud Storage: storage.googleapis.com/{bucket} bucket.storage.googleapis.com/
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the package.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public PackageResponse build() {
            return new PackageResponse(location, name);
        }
    }
}
