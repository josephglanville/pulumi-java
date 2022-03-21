// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ListAssetContainerSasResult {
    /**
     * The list of Asset container SAS URLs.
     * 
     */
    private final @Nullable List<String> assetContainerSasUrls;

    @CustomType.Constructor
    private ListAssetContainerSasResult(@CustomType.Parameter("assetContainerSasUrls") @Nullable List<String> assetContainerSasUrls) {
        this.assetContainerSasUrls = assetContainerSasUrls;
    }

    /**
     * The list of Asset container SAS URLs.
     * 
    */
    public List<String> getAssetContainerSasUrls() {
        return this.assetContainerSasUrls == null ? List.of() : this.assetContainerSasUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAssetContainerSasResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> assetContainerSasUrls;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAssetContainerSasResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetContainerSasUrls = defaults.assetContainerSasUrls;
        }

        public Builder assetContainerSasUrls(@Nullable List<String> assetContainerSasUrls) {
            this.assetContainerSasUrls = assetContainerSasUrls;
            return this;
        }
        public Builder assetContainerSasUrls(String... assetContainerSasUrls) {
            return assetContainerSasUrls(List.of(assetContainerSasUrls));
        }        public ListAssetContainerSasResult build() {
            return new ListAssetContainerSasResult(assetContainerSasUrls);
        }
    }
}
