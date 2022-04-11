// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.asset.AssetOrArchive;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.storage.inputs.BucketObjectCustomerEncryptionGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketObjectState extends io.pulumi.resources.ResourceArgs {

    public static final BucketObjectState Empty = new BucketObjectState();

    /**
     * The name of the containing bucket.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Codegen.empty() : this.bucket;
    }

    /**
     * [Cache-Control](https://tools.ietf.org/html/rfc7234#section-5.2)
     * directive to specify caching behavior of object data. If omitted and object is accessible to all anonymous users, the default will be public, max-age=3600
     * 
     */
    @Import(name="cacheControl")
      private final @Nullable Output<String> cacheControl;

    public Output<String> getCacheControl() {
        return this.cacheControl == null ? Codegen.empty() : this.cacheControl;
    }

    /**
     * Data as `string` to be uploaded. Must be defined if `source` is not. **Note**: The `content` field is marked as sensitive.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Codegen.empty() : this.content;
    }

    /**
     * [Content-Disposition](https://tools.ietf.org/html/rfc6266) of the object data.
     * 
     */
    @Import(name="contentDisposition")
      private final @Nullable Output<String> contentDisposition;

    public Output<String> getContentDisposition() {
        return this.contentDisposition == null ? Codegen.empty() : this.contentDisposition;
    }

    /**
     * [Content-Encoding](https://tools.ietf.org/html/rfc7231#section-3.1.2.2) of the object data.
     * 
     */
    @Import(name="contentEncoding")
      private final @Nullable Output<String> contentEncoding;

    public Output<String> getContentEncoding() {
        return this.contentEncoding == null ? Codegen.empty() : this.contentEncoding;
    }

    /**
     * [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object data.
     * 
     */
    @Import(name="contentLanguage")
      private final @Nullable Output<String> contentLanguage;

    public Output<String> getContentLanguage() {
        return this.contentLanguage == null ? Codegen.empty() : this.contentLanguage;
    }

    /**
     * [Content-Type](https://tools.ietf.org/html/rfc7231#section-3.1.1.5) of the object data. Defaults to "application/octet-stream" or "text/plain; charset=utf-8".
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * (Computed) Base 64 CRC32 hash of the uploaded data.
     * 
     */
    @Import(name="crc32c")
      private final @Nullable Output<String> crc32c;

    public Output<String> getCrc32c() {
        return this.crc32c == null ? Codegen.empty() : this.crc32c;
    }

    /**
     * Enables object encryption with Customer-Supplied Encryption Key (CSEK). Google [documentation about CSEK.](https://cloud.google.com/storage/docs/encryption/customer-supplied-keys)
     * Structure is documented below.
     * 
     */
    @Import(name="customerEncryption")
      private final @Nullable Output<BucketObjectCustomerEncryptionGetArgs> customerEncryption;

    public Output<BucketObjectCustomerEncryptionGetArgs> getCustomerEncryption() {
        return this.customerEncryption == null ? Codegen.empty() : this.customerEncryption;
    }

    @Import(name="detectMd5hash")
      private final @Nullable Output<String> detectMd5hash;

    public Output<String> getDetectMd5hash() {
        return this.detectMd5hash == null ? Codegen.empty() : this.detectMd5hash;
    }

    /**
     * Whether an object is under event-based hold. Event-based hold is a way to retain objects until an event occurs, which is
     * signified by the hold's release (i.e. this value is set to false). After being released (set to false), such objects
     * will be subject to bucket-level retention (if any).
     * 
     */
    @Import(name="eventBasedHold")
      private final @Nullable Output<Boolean> eventBasedHold;

    public Output<Boolean> getEventBasedHold() {
        return this.eventBasedHold == null ? Codegen.empty() : this.eventBasedHold;
    }

    /**
     * The resource name of the Cloud KMS key that will be used to [encrypt](https://cloud.google.com/storage/docs/encryption/using-customer-managed-keys) the object.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * (Computed) Base 64 MD5 hash of the uploaded data.
     * 
     */
    @Import(name="md5hash")
      private final @Nullable Output<String> md5hash;

    public Output<String> getMd5hash() {
        return this.md5hash == null ? Codegen.empty() : this.md5hash;
    }

    /**
     * (Computed) A url reference to download this object.
     * 
     */
    @Import(name="mediaLink")
      private final @Nullable Output<String> mediaLink;

    public Output<String> getMediaLink() {
        return this.mediaLink == null ? Codegen.empty() : this.mediaLink;
    }

    /**
     * User-provided metadata, in key/value pairs.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The name of the object. If you're interpolating the name of this object, see `output_name` instead.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * (Computed) The name of the object. Use this field in interpolations with `gcp.storage.ObjectACL` to recreate
     * `gcp.storage.ObjectACL` resources when your `gcp.storage.BucketObject` is recreated.
     * 
     */
    @Import(name="outputName")
      private final @Nullable Output<String> outputName;

    public Output<String> getOutputName() {
        return this.outputName == null ? Codegen.empty() : this.outputName;
    }

    /**
     * (Computed) A url reference to this object.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Codegen.empty() : this.selfLink;
    }

    /**
     * A path to the data you want to upload. Must be defined
     * if `content` is not.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<AssetOrArchive> source;

    public Output<AssetOrArchive> getSource() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * The [StorageClass](https://cloud.google.com/storage/docs/storage-classes) of the new bucket object.
     * Supported values include: `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`. If not provided, this defaults to the bucket's default
     * storage class or to a [standard](https://cloud.google.com/storage/docs/storage-classes#standard) class.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass == null ? Codegen.empty() : this.storageClass;
    }

    /**
     * Whether an object is under temporary hold. While this flag is set to true, the object is protected against deletion and
     * overwrites.
     * 
     */
    @Import(name="temporaryHold")
      private final @Nullable Output<Boolean> temporaryHold;

    public Output<Boolean> getTemporaryHold() {
        return this.temporaryHold == null ? Codegen.empty() : this.temporaryHold;
    }

    public BucketObjectState(
        @Nullable Output<String> bucket,
        @Nullable Output<String> cacheControl,
        @Nullable Output<String> content,
        @Nullable Output<String> contentDisposition,
        @Nullable Output<String> contentEncoding,
        @Nullable Output<String> contentLanguage,
        @Nullable Output<String> contentType,
        @Nullable Output<String> crc32c,
        @Nullable Output<BucketObjectCustomerEncryptionGetArgs> customerEncryption,
        @Nullable Output<String> detectMd5hash,
        @Nullable Output<Boolean> eventBasedHold,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<String> md5hash,
        @Nullable Output<String> mediaLink,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> outputName,
        @Nullable Output<String> selfLink,
        @Nullable Output<AssetOrArchive> source,
        @Nullable Output<String> storageClass,
        @Nullable Output<Boolean> temporaryHold) {
        this.bucket = bucket;
        this.cacheControl = cacheControl;
        this.content = content;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;
        this.crc32c = crc32c;
        this.customerEncryption = customerEncryption;
        this.detectMd5hash = detectMd5hash;
        this.eventBasedHold = eventBasedHold;
        this.kmsKeyName = kmsKeyName;
        this.md5hash = md5hash;
        this.mediaLink = mediaLink;
        this.metadata = metadata;
        this.name = name;
        this.outputName = outputName;
        this.selfLink = selfLink;
        this.source = source;
        this.storageClass = storageClass;
        this.temporaryHold = temporaryHold;
    }

    private BucketObjectState() {
        this.bucket = Codegen.empty();
        this.cacheControl = Codegen.empty();
        this.content = Codegen.empty();
        this.contentDisposition = Codegen.empty();
        this.contentEncoding = Codegen.empty();
        this.contentLanguage = Codegen.empty();
        this.contentType = Codegen.empty();
        this.crc32c = Codegen.empty();
        this.customerEncryption = Codegen.empty();
        this.detectMd5hash = Codegen.empty();
        this.eventBasedHold = Codegen.empty();
        this.kmsKeyName = Codegen.empty();
        this.md5hash = Codegen.empty();
        this.mediaLink = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.outputName = Codegen.empty();
        this.selfLink = Codegen.empty();
        this.source = Codegen.empty();
        this.storageClass = Codegen.empty();
        this.temporaryHold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketObjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<String> cacheControl;
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentDisposition;
        private @Nullable Output<String> contentEncoding;
        private @Nullable Output<String> contentLanguage;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> crc32c;
        private @Nullable Output<BucketObjectCustomerEncryptionGetArgs> customerEncryption;
        private @Nullable Output<String> detectMd5hash;
        private @Nullable Output<Boolean> eventBasedHold;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<String> md5hash;
        private @Nullable Output<String> mediaLink;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> outputName;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<AssetOrArchive> source;
        private @Nullable Output<String> storageClass;
        private @Nullable Output<Boolean> temporaryHold;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketObjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.content = defaults.content;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customerEncryption = defaults.customerEncryption;
    	      this.detectMd5hash = defaults.detectMd5hash;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5hash = defaults.md5hash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputName = defaults.outputName;
    	      this.selfLink = defaults.selfLink;
    	      this.source = defaults.source;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder bucket(@Nullable String bucket) {
            this.bucket = Codegen.ofNullable(bucket);
            return this;
        }
        public Builder cacheControl(@Nullable Output<String> cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }
        public Builder cacheControl(@Nullable String cacheControl) {
            this.cacheControl = Codegen.ofNullable(cacheControl);
            return this;
        }
        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Codegen.ofNullable(content);
            return this;
        }
        public Builder contentDisposition(@Nullable Output<String> contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }
        public Builder contentDisposition(@Nullable String contentDisposition) {
            this.contentDisposition = Codegen.ofNullable(contentDisposition);
            return this;
        }
        public Builder contentEncoding(@Nullable Output<String> contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }
        public Builder contentEncoding(@Nullable String contentEncoding) {
            this.contentEncoding = Codegen.ofNullable(contentEncoding);
            return this;
        }
        public Builder contentLanguage(@Nullable Output<String> contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }
        public Builder contentLanguage(@Nullable String contentLanguage) {
            this.contentLanguage = Codegen.ofNullable(contentLanguage);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder crc32c(@Nullable Output<String> crc32c) {
            this.crc32c = crc32c;
            return this;
        }
        public Builder crc32c(@Nullable String crc32c) {
            this.crc32c = Codegen.ofNullable(crc32c);
            return this;
        }
        public Builder customerEncryption(@Nullable Output<BucketObjectCustomerEncryptionGetArgs> customerEncryption) {
            this.customerEncryption = customerEncryption;
            return this;
        }
        public Builder customerEncryption(@Nullable BucketObjectCustomerEncryptionGetArgs customerEncryption) {
            this.customerEncryption = Codegen.ofNullable(customerEncryption);
            return this;
        }
        public Builder detectMd5hash(@Nullable Output<String> detectMd5hash) {
            this.detectMd5hash = detectMd5hash;
            return this;
        }
        public Builder detectMd5hash(@Nullable String detectMd5hash) {
            this.detectMd5hash = Codegen.ofNullable(detectMd5hash);
            return this;
        }
        public Builder eventBasedHold(@Nullable Output<Boolean> eventBasedHold) {
            this.eventBasedHold = eventBasedHold;
            return this;
        }
        public Builder eventBasedHold(@Nullable Boolean eventBasedHold) {
            this.eventBasedHold = Codegen.ofNullable(eventBasedHold);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder md5hash(@Nullable Output<String> md5hash) {
            this.md5hash = md5hash;
            return this;
        }
        public Builder md5hash(@Nullable String md5hash) {
            this.md5hash = Codegen.ofNullable(md5hash);
            return this;
        }
        public Builder mediaLink(@Nullable Output<String> mediaLink) {
            this.mediaLink = mediaLink;
            return this;
        }
        public Builder mediaLink(@Nullable String mediaLink) {
            this.mediaLink = Codegen.ofNullable(mediaLink);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder outputName(@Nullable Output<String> outputName) {
            this.outputName = outputName;
            return this;
        }
        public Builder outputName(@Nullable String outputName) {
            this.outputName = Codegen.ofNullable(outputName);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Codegen.ofNullable(selfLink);
            return this;
        }
        public Builder source(@Nullable Output<AssetOrArchive> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable AssetOrArchive source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder storageClass(@Nullable Output<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = Codegen.ofNullable(storageClass);
            return this;
        }
        public Builder temporaryHold(@Nullable Output<Boolean> temporaryHold) {
            this.temporaryHold = temporaryHold;
            return this;
        }
        public Builder temporaryHold(@Nullable Boolean temporaryHold) {
            this.temporaryHold = Codegen.ofNullable(temporaryHold);
            return this;
        }        public BucketObjectState build() {
            return new BucketObjectState(bucket, cacheControl, content, contentDisposition, contentEncoding, contentLanguage, contentType, crc32c, customerEncryption, detectMd5hash, eventBasedHold, kmsKeyName, md5hash, mediaLink, metadata, name, outputName, selfLink, source, storageClass, temporaryHold);
        }
    }
}
