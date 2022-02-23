// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Template Options for the static site.
 * 
 */
public final class StaticSiteTemplateOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final StaticSiteTemplateOptionsResponse Empty = new StaticSiteTemplateOptionsResponse();

    /**
     * Description of the newly generated repository.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Whether or not the newly generated repository is a private repository. Defaults to false (i.e. public).
     * 
     */
    @InputImport(name="isPrivate")
      private final @Nullable Boolean isPrivate;

    public Optional<Boolean> getIsPrivate() {
        return this.isPrivate == null ? Optional.empty() : Optional.ofNullable(this.isPrivate);
    }

    /**
     * Owner of the newly generated repository.
     * 
     */
    @InputImport(name="owner")
      private final @Nullable String owner;

    public Optional<String> getOwner() {
        return this.owner == null ? Optional.empty() : Optional.ofNullable(this.owner);
    }

    /**
     * Name of the newly generated repository.
     * 
     */
    @InputImport(name="repositoryName")
      private final @Nullable String repositoryName;

    public Optional<String> getRepositoryName() {
        return this.repositoryName == null ? Optional.empty() : Optional.ofNullable(this.repositoryName);
    }

    /**
     * URL of the template repository. The newly generated repository will be based on this one.
     * 
     */
    @InputImport(name="templateRepositoryUrl")
      private final @Nullable String templateRepositoryUrl;

    public Optional<String> getTemplateRepositoryUrl() {
        return this.templateRepositoryUrl == null ? Optional.empty() : Optional.ofNullable(this.templateRepositoryUrl);
    }

    public StaticSiteTemplateOptionsResponse(
        @Nullable String description,
        @Nullable Boolean isPrivate,
        @Nullable String owner,
        @Nullable String repositoryName,
        @Nullable String templateRepositoryUrl) {
        this.description = description;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.repositoryName = repositoryName;
        this.templateRepositoryUrl = templateRepositoryUrl;
    }

    private StaticSiteTemplateOptionsResponse() {
        this.description = null;
        this.isPrivate = null;
        this.owner = null;
        this.repositoryName = null;
        this.templateRepositoryUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticSiteTemplateOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean isPrivate;
        private @Nullable String owner;
        private @Nullable String repositoryName;
        private @Nullable String templateRepositoryUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticSiteTemplateOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.isPrivate = defaults.isPrivate;
    	      this.owner = defaults.owner;
    	      this.repositoryName = defaults.repositoryName;
    	      this.templateRepositoryUrl = defaults.templateRepositoryUrl;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsPrivate(@Nullable Boolean isPrivate) {
            this.isPrivate = isPrivate;
            return this;
        }

        public Builder setOwner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }

        public Builder setRepositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder setTemplateRepositoryUrl(@Nullable String templateRepositoryUrl) {
            this.templateRepositoryUrl = templateRepositoryUrl;
            return this;
        }
        public StaticSiteTemplateOptionsResponse build() {
            return new StaticSiteTemplateOptionsResponse(description, isPrivate, owner, repositoryName, templateRepositoryUrl);
        }
    }
}
