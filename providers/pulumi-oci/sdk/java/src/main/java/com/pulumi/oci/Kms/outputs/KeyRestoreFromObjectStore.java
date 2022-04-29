// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyRestoreFromObjectStore {
    /**
     * @return (Updatable) Name of the bucket where key was backed up
     * 
     */
    private final @Nullable String bucket;
    /**
     * @return (Updatable) Type of backup to restore from. Values of &#34;BUCKET&#34;, &#34;PRE_AUTHENTICATED_REQUEST_URI&#34; are supported
     * 
     */
    private final String destination;
    /**
     * @return (Updatable) Namespace of the bucket where key was backed up
     * 
     */
    private final @Nullable String namespace;
    /**
     * @return (Updatable) Object containing the backup
     * 
     */
    private final @Nullable String object;
    /**
     * @return (Updatable) Pre-authenticated-request-uri of the backup
     * 
     */
    private final @Nullable String uri;

    @CustomType.Constructor
    private KeyRestoreFromObjectStore(
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("destination") String destination,
        @CustomType.Parameter("namespace") @Nullable String namespace,
        @CustomType.Parameter("object") @Nullable String object,
        @CustomType.Parameter("uri") @Nullable String uri) {
        this.bucket = bucket;
        this.destination = destination;
        this.namespace = namespace;
        this.object = object;
        this.uri = uri;
    }

    /**
     * @return (Updatable) Name of the bucket where key was backed up
     * 
     */
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * @return (Updatable) Type of backup to restore from. Values of &#34;BUCKET&#34;, &#34;PRE_AUTHENTICATED_REQUEST_URI&#34; are supported
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return (Updatable) Namespace of the bucket where key was backed up
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }
    /**
     * @return (Updatable) Object containing the backup
     * 
     */
    public Optional<String> object() {
        return Optional.ofNullable(this.object);
    }
    /**
     * @return (Updatable) Pre-authenticated-request-uri of the backup
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRestoreFromObjectStore defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private String destination;
        private @Nullable String namespace;
        private @Nullable String object;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRestoreFromObjectStore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.destination = defaults.destination;
    	      this.namespace = defaults.namespace;
    	      this.object = defaults.object;
    	      this.uri = defaults.uri;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder object(@Nullable String object) {
            this.object = object;
            return this;
        }
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }        public KeyRestoreFromObjectStore build() {
            return new KeyRestoreFromObjectStore(bucket, destination, namespace, object, uri);
        }
    }
}
