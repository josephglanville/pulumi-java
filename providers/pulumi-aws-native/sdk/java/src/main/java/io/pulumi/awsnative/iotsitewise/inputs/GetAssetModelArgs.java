// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssetModelArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssetModelArgs Empty = new GetAssetModelArgs();

    /**
     * The ID of the asset model.
     * 
     */
    @Import(name="assetModelId", required=true)
      private final String assetModelId;

    public String getAssetModelId() {
        return this.assetModelId;
    }

    public GetAssetModelArgs(String assetModelId) {
        this.assetModelId = Objects.requireNonNull(assetModelId, "expected parameter 'assetModelId' to be non-null");
    }

    private GetAssetModelArgs() {
        this.assetModelId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetModelId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetModelId = defaults.assetModelId;
        }

        public Builder assetModelId(String assetModelId) {
            this.assetModelId = Objects.requireNonNull(assetModelId);
            return this;
        }        public GetAssetModelArgs build() {
            return new GetAssetModelArgs(assetModelId);
        }
    }
}
