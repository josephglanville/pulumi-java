// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApplicationResult {
    private final @Nullable Boolean allowUpdates;
    private final @Nullable String defaultVersion;
    private final @Nullable String displayName;
    private final String etag;
    private final String id;
    private final String name;
    private final String type;

    @OutputCustomType.Constructor({"allowUpdates","defaultVersion","displayName","etag","id","name","type"})
    private GetApplicationResult(
        @Nullable Boolean allowUpdates,
        @Nullable String defaultVersion,
        @Nullable String displayName,
        String etag,
        String id,
        String name,
        String type) {
        this.allowUpdates = allowUpdates;
        this.defaultVersion = defaultVersion;
        this.displayName = displayName;
        this.etag = Objects.requireNonNull(etag);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Boolean> getAllowUpdates() {
        return Optional.ofNullable(this.allowUpdates);
    }
    public Optional<String> getDefaultVersion() {
        return Optional.ofNullable(this.defaultVersion);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowUpdates;
        private @Nullable String defaultVersion;
        private @Nullable String displayName;
        private String etag;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowUpdates = defaults.allowUpdates;
    	      this.defaultVersion = defaults.defaultVersion;
    	      this.displayName = defaults.displayName;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setAllowUpdates(@Nullable Boolean allowUpdates) {
            this.allowUpdates = allowUpdates;
            return this;
        }

        public Builder setDefaultVersion(@Nullable String defaultVersion) {
            this.defaultVersion = defaultVersion;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetApplicationResult build() {
            return new GetApplicationResult(allowUpdates, defaultVersion, displayName, etag, id, name, type);
        }
    }
}
