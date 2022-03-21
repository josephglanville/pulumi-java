// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetApplicationPackageResult {
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    private final String etag;
    /**
     * The format of the application package, if the package is active.
     * 
     */
    private final String format;
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The time at which the package was last activated, if the package is active.
     * 
     */
    private final String lastActivationTime;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The current state of the application package.
     * 
     */
    private final String state;
    /**
     * The URL for the application package in Azure Storage.
     * 
     */
    private final String storageUrl;
    /**
     * The UTC time at which the Azure Storage URL will expire.
     * 
     */
    private final String storageUrlExpiry;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetApplicationPackageResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("format") String format,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastActivationTime") String lastActivationTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("storageUrl") String storageUrl,
        @CustomType.Parameter("storageUrlExpiry") String storageUrlExpiry,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.format = format;
        this.id = id;
        this.lastActivationTime = lastActivationTime;
        this.name = name;
        this.state = state;
        this.storageUrl = storageUrl;
        this.storageUrlExpiry = storageUrlExpiry;
        this.type = type;
    }

    /**
     * The ETag of the resource, used for concurrency statements.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The format of the application package, if the package is active.
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The time at which the package was last activated, if the package is active.
     * 
    */
    public String getLastActivationTime() {
        return this.lastActivationTime;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The current state of the application package.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The URL for the application package in Azure Storage.
     * 
    */
    public String getStorageUrl() {
        return this.storageUrl;
    }
    /**
     * The UTC time at which the Azure Storage URL will expire.
     * 
    */
    public String getStorageUrlExpiry() {
        return this.storageUrlExpiry;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationPackageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String format;
        private String id;
        private String lastActivationTime;
        private String name;
        private String state;
        private String storageUrl;
        private String storageUrlExpiry;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationPackageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.format = defaults.format;
    	      this.id = defaults.id;
    	      this.lastActivationTime = defaults.lastActivationTime;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.storageUrl = defaults.storageUrl;
    	      this.storageUrlExpiry = defaults.storageUrlExpiry;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder format(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastActivationTime(String lastActivationTime) {
            this.lastActivationTime = Objects.requireNonNull(lastActivationTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder storageUrl(String storageUrl) {
            this.storageUrl = Objects.requireNonNull(storageUrl);
            return this;
        }
        public Builder storageUrlExpiry(String storageUrlExpiry) {
            this.storageUrlExpiry = Objects.requireNonNull(storageUrlExpiry);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetApplicationPackageResult build() {
            return new GetApplicationPackageResult(etag, format, id, lastActivationTime, name, state, storageUrl, storageUrlExpiry, type);
        }
    }
}
