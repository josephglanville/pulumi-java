// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.iam.inputs.SAMLProviderTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SAMLProviderArgs extends io.pulumi.resources.ResourceArgs {

    public static final SAMLProviderArgs Empty = new SAMLProviderArgs();

    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="samlMetadataDocument", required=true)
      private final Input<String> samlMetadataDocument;

    public Input<String> getSamlMetadataDocument() {
        return this.samlMetadataDocument;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<SAMLProviderTagArgs>> tags;

    public Input<List<SAMLProviderTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SAMLProviderArgs(
        @Nullable Input<String> name,
        Input<String> samlMetadataDocument,
        @Nullable Input<List<SAMLProviderTagArgs>> tags) {
        this.name = name;
        this.samlMetadataDocument = Objects.requireNonNull(samlMetadataDocument, "expected parameter 'samlMetadataDocument' to be non-null");
        this.tags = tags;
    }

    private SAMLProviderArgs() {
        this.name = Input.empty();
        this.samlMetadataDocument = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SAMLProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> samlMetadataDocument;
        private @Nullable Input<List<SAMLProviderTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SAMLProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.samlMetadataDocument = defaults.samlMetadataDocument;
    	      this.tags = defaults.tags;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSamlMetadataDocument(Input<String> samlMetadataDocument) {
            this.samlMetadataDocument = Objects.requireNonNull(samlMetadataDocument);
            return this;
        }

        public Builder setSamlMetadataDocument(String samlMetadataDocument) {
            this.samlMetadataDocument = Input.of(Objects.requireNonNull(samlMetadataDocument));
            return this;
        }

        public Builder setTags(@Nullable Input<List<SAMLProviderTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SAMLProviderTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public SAMLProviderArgs build() {
            return new SAMLProviderArgs(name, samlMetadataDocument, tags);
        }
    }
}
