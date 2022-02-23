// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Connection error
 * 
 */
public final class ConnectionErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionErrorResponse Empty = new ConnectionErrorResponse();

    /**
     * Code of the status
     * 
     */
    @InputImport(name="code")
      private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    /**
     * Resource ETag
     * 
     */
    @InputImport(name="etag")
      private final @Nullable String etag;

    public Optional<String> getEtag() {
        return this.etag == null ? Optional.empty() : Optional.ofNullable(this.etag);
    }

    /**
     * Resource id
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Description of the status
     * 
     */
    @InputImport(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    /**
     * Resource name
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ConnectionErrorResponse(
        @Nullable String code,
        @Nullable String etag,
        String id,
        @Nullable String location,
        @Nullable String message,
        String name,
        @Nullable Map<String,String> tags,
        String type) {
        this.code = code;
        this.etag = etag;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = location;
        this.message = message;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConnectionErrorResponse() {
        this.code = null;
        this.etag = null;
        this.id = null;
        this.location = null;
        this.message = null;
        this.name = null;
        this.tags = Map.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private @Nullable String message;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ConnectionErrorResponse build() {
            return new ConnectionErrorResponse(code, etag, id, location, message, name, tags, type);
        }
    }
}
