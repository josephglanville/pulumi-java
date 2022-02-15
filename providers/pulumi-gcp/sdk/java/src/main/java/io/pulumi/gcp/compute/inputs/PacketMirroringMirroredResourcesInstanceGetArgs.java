// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PacketMirroringMirroredResourcesInstanceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesInstanceGetArgs Empty = new PacketMirroringMirroredResourcesInstanceGetArgs();

    @InputImport(name="url", required=true)
    private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public PacketMirroringMirroredResourcesInstanceGetArgs(Input<String> url) {
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private PacketMirroringMirroredResourcesInstanceGetArgs() {
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesInstanceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourcesInstanceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.url = defaults.url;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }

        public PacketMirroringMirroredResourcesInstanceGetArgs build() {
            return new PacketMirroringMirroredResourcesInstanceGetArgs(url);
        }
    }
}