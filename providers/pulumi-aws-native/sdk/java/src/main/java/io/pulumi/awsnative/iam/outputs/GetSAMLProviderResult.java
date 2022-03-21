// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam.outputs;

import io.pulumi.awsnative.iam.outputs.SAMLProviderTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSAMLProviderResult {
    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
     */
    private final @Nullable String arn;
    private final @Nullable String samlMetadataDocument;
    private final @Nullable List<SAMLProviderTag> tags;

    @CustomType.Constructor
    private GetSAMLProviderResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("samlMetadataDocument") @Nullable String samlMetadataDocument,
        @CustomType.Parameter("tags") @Nullable List<SAMLProviderTag> tags) {
        this.arn = arn;
        this.samlMetadataDocument = samlMetadataDocument;
        this.tags = tags;
    }

    /**
     * Amazon Resource Name (ARN) of the SAML provider
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getSamlMetadataDocument() {
        return Optional.ofNullable(this.samlMetadataDocument);
    }
    public List<SAMLProviderTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSAMLProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String samlMetadataDocument;
        private @Nullable List<SAMLProviderTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSAMLProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder samlMetadataDocument(@Nullable String samlMetadataDocument) {
            this.samlMetadataDocument = samlMetadataDocument;
            return this;
        }
        public Builder tags(@Nullable List<SAMLProviderTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(SAMLProviderTag... tags) {
            return tags(List.of(tags));
        }        public GetSAMLProviderResult build() {
            return new GetSAMLProviderResult(arn, samlMetadataDocument, tags);
        }
    }
}
