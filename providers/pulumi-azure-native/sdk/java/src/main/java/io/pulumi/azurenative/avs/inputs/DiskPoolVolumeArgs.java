// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An iSCSI volume from Microsoft.StoragePool provider
 * 
 */
public final class DiskPoolVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskPoolVolumeArgs Empty = new DiskPoolVolumeArgs();

    /**
     * iSCSI provider target IP address list
     * 
     */
    @Import(name="endpoints")
      private final @Nullable Output<List<String>> endpoints;

    public Output<List<String>> getEndpoints() {
        return this.endpoints == null ? Codegen.empty() : this.endpoints;
    }

    /**
     * Name of the LUN to be used
     * 
     */
    @Import(name="lunName")
      private final @Nullable Output<String> lunName;

    public Output<String> getLunName() {
        return this.lunName == null ? Codegen.empty() : this.lunName;
    }

    public DiskPoolVolumeArgs(
        @Nullable Output<List<String>> endpoints,
        @Nullable Output<String> lunName) {
        this.endpoints = endpoints;
        this.lunName = lunName;
    }

    private DiskPoolVolumeArgs() {
        this.endpoints = Codegen.empty();
        this.lunName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskPoolVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> endpoints;
        private @Nullable Output<String> lunName;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskPoolVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
    	      this.lunName = defaults.lunName;
        }

        public Builder endpoints(@Nullable Output<List<String>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(@Nullable List<String> endpoints) {
            this.endpoints = Codegen.ofNullable(endpoints);
            return this;
        }
        public Builder endpoints(String... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder lunName(@Nullable Output<String> lunName) {
            this.lunName = lunName;
            return this;
        }
        public Builder lunName(@Nullable String lunName) {
            this.lunName = Codegen.ofNullable(lunName);
            return this;
        }        public DiskPoolVolumeArgs build() {
            return new DiskPoolVolumeArgs(endpoints, lunName);
        }
    }
}
