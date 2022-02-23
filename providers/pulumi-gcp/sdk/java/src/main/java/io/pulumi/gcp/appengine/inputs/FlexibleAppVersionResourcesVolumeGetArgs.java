// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionResourcesVolumeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionResourcesVolumeGetArgs Empty = new FlexibleAppVersionResourcesVolumeGetArgs();

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @InputImport(name="sizeGb", required=true)
      private final Input<Integer> sizeGb;

    public Input<Integer> getSizeGb() {
        return this.sizeGb;
    }

    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    @InputImport(name="volumeType", required=true)
      private final Input<String> volumeType;

    public Input<String> getVolumeType() {
        return this.volumeType;
    }

    public FlexibleAppVersionResourcesVolumeGetArgs(
        Input<String> name,
        Input<Integer> sizeGb,
        Input<String> volumeType) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sizeGb = Objects.requireNonNull(sizeGb, "expected parameter 'sizeGb' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private FlexibleAppVersionResourcesVolumeGetArgs() {
        this.name = Input.empty();
        this.sizeGb = Input.empty();
        this.volumeType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionResourcesVolumeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<Integer> sizeGb;
        private Input<String> volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionResourcesVolumeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSizeGb(Input<Integer> sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }

        public Builder setSizeGb(Integer sizeGb) {
            this.sizeGb = Input.of(Objects.requireNonNull(sizeGb));
            return this;
        }

        public Builder setVolumeType(Input<String> volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }

        public Builder setVolumeType(String volumeType) {
            this.volumeType = Input.of(Objects.requireNonNull(volumeType));
            return this;
        }
        public FlexibleAppVersionResourcesVolumeGetArgs build() {
            return new FlexibleAppVersionResourcesVolumeGetArgs(name, sizeGb, volumeType);
        }
    }
}
