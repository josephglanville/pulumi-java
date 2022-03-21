// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegistryImageResult {
    private final @Nullable String digest;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String imageUrl;
    private final String name;
    private final String project;
    private final @Nullable String region;
    private final @Nullable String tag;

    @CustomType.Constructor
    private GetRegistryImageResult(
        @CustomType.Parameter("digest") @Nullable String digest,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("imageUrl") String imageUrl,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("tag") @Nullable String tag) {
        this.digest = digest;
        this.id = id;
        this.imageUrl = imageUrl;
        this.name = name;
        this.project = project;
        this.region = region;
        this.tag = tag;
    }

    public Optional<String> getDigest() {
        return Optional.ofNullable(this.digest);
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    public String getName() {
        return this.name;
    }
    public String getProject() {
        return this.project;
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public Optional<String> getTag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String digest;
        private String id;
        private String imageUrl;
        private String name;
        private String project;
        private @Nullable String region;
        private @Nullable String tag;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.id = defaults.id;
    	      this.imageUrl = defaults.imageUrl;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.tag = defaults.tag;
        }

        public Builder digest(@Nullable String digest) {
            this.digest = digest;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder imageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }        public GetRegistryImageResult build() {
            return new GetRegistryImageResult(digest, id, imageUrl, name, project, region, tag);
        }
    }
}
