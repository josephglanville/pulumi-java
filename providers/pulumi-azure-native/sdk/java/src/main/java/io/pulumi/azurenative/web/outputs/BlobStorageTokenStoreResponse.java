// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobStorageTokenStoreResponse {
    private final @Nullable String sasUrlSettingName;

    @OutputCustomType.Constructor({"sasUrlSettingName"})
    private BlobStorageTokenStoreResponse(@Nullable String sasUrlSettingName) {
        this.sasUrlSettingName = sasUrlSettingName;
    }

    public Optional<String> getSasUrlSettingName() {
        return Optional.ofNullable(this.sasUrlSettingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobStorageTokenStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sasUrlSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobStorageTokenStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUrlSettingName = defaults.sasUrlSettingName;
        }

        public Builder setSasUrlSettingName(@Nullable String sasUrlSettingName) {
            this.sasUrlSettingName = sasUrlSettingName;
            return this;
        }

        public BlobStorageTokenStoreResponse build() {
            return new BlobStorageTokenStoreResponse(sasUrlSettingName);
        }
    }
}
