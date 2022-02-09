// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiResourceGeneralInformationResponse {
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String iconUrl;
    private final @Nullable String releaseTag;
    private final @Nullable String termsOfUseUrl;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"description","displayName","iconUrl","releaseTag","termsOfUseUrl","tier"})
    private ApiResourceGeneralInformationResponse(
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String iconUrl,
        @Nullable String releaseTag,
        @Nullable String termsOfUseUrl,
        @Nullable String tier) {
        this.description = description;
        this.displayName = displayName;
        this.iconUrl = iconUrl;
        this.releaseTag = releaseTag;
        this.termsOfUseUrl = termsOfUseUrl;
        this.tier = tier;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getIconUrl() {
        return Optional.ofNullable(this.iconUrl);
    }
    public Optional<String> getReleaseTag() {
        return Optional.ofNullable(this.releaseTag);
    }
    public Optional<String> getTermsOfUseUrl() {
        return Optional.ofNullable(this.termsOfUseUrl);
    }
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceGeneralInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String iconUrl;
        private @Nullable String releaseTag;
        private @Nullable String termsOfUseUrl;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceGeneralInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.iconUrl = defaults.iconUrl;
    	      this.releaseTag = defaults.releaseTag;
    	      this.termsOfUseUrl = defaults.termsOfUseUrl;
    	      this.tier = defaults.tier;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setIconUrl(@Nullable String iconUrl) {
            this.iconUrl = iconUrl;
            return this;
        }

        public Builder setReleaseTag(@Nullable String releaseTag) {
            this.releaseTag = releaseTag;
            return this;
        }

        public Builder setTermsOfUseUrl(@Nullable String termsOfUseUrl) {
            this.termsOfUseUrl = termsOfUseUrl;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public ApiResourceGeneralInformationResponse build() {
            return new ApiResourceGeneralInformationResponse(description, displayName, iconUrl, releaseTag, termsOfUseUrl, tier);
        }
    }
}
