// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.storage.inputs.BucketCorArgs;
import io.pulumi.gcp.storage.inputs.BucketEncryptionArgs;
import io.pulumi.gcp.storage.inputs.BucketLifecycleRuleArgs;
import io.pulumi.gcp.storage.inputs.BucketLoggingArgs;
import io.pulumi.gcp.storage.inputs.BucketRetentionPolicyArgs;
import io.pulumi.gcp.storage.inputs.BucketVersioningArgs;
import io.pulumi.gcp.storage.inputs.BucketWebsiteArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketArgs Empty = new BucketArgs();

    /**
     * The bucket's [Cross-Origin Resource Sharing (CORS)](https://www.w3.org/TR/cors/) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Import(name="cors")
      private final @Nullable Output<List<BucketCorArgs>> cors;

    public Output<List<BucketCorArgs>> getCors() {
        return this.cors == null ? Codegen.empty() : this.cors;
    }

    @Import(name="defaultEventBasedHold")
      private final @Nullable Output<Boolean> defaultEventBasedHold;

    public Output<Boolean> getDefaultEventBasedHold() {
        return this.defaultEventBasedHold == null ? Codegen.empty() : this.defaultEventBasedHold;
    }

    /**
     * The bucket's encryption configuration. Structure is documented below.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<BucketEncryptionArgs> encryption;

    public Output<BucketEncryptionArgs> getEncryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * When deleting a bucket, this
     * boolean option will delete all contained objects. If you try to delete a
     * bucket that contains objects, the provider will fail that run.
     * 
     */
    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Codegen.empty() : this.forceDestroy;
    }

    /**
     * A map of key/value label pairs to assign to the bucket.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The bucket's [Lifecycle Rules](https://cloud.google.com/storage/docs/lifecycle#configuration) configuration. Multiple blocks of this type are permitted. Structure is documented below.
     * 
     */
    @Import(name="lifecycleRules")
      private final @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;

    public Output<List<BucketLifecycleRuleArgs>> getLifecycleRules() {
        return this.lifecycleRules == null ? Codegen.empty() : this.lifecycleRules;
    }

    /**
     * The [GCS location](https://cloud.google.com/storage/docs/bucket-locations)
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * The bucket's [Access & Storage Logs](https://cloud.google.com/storage/docs/access-logs) configuration. Structure is documented below.
     * 
     */
    @Import(name="logging")
      private final @Nullable Output<BucketLoggingArgs> logging;

    public Output<BucketLoggingArgs> getLogging() {
        return this.logging == null ? Codegen.empty() : this.logging;
    }

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Prevents public access to a bucket.
     * 
     */
    @Import(name="publicAccessPrevention")
      private final @Nullable Output<String> publicAccessPrevention;

    public Output<String> getPublicAccessPrevention() {
        return this.publicAccessPrevention == null ? Codegen.empty() : this.publicAccessPrevention;
    }

    /**
     * Enables [Requester Pays](https://cloud.google.com/storage/docs/requester-pays) on a storage bucket.
     * 
     */
    @Import(name="requesterPays")
      private final @Nullable Output<Boolean> requesterPays;

    public Output<Boolean> getRequesterPays() {
        return this.requesterPays == null ? Codegen.empty() : this.requesterPays;
    }

    /**
     * Configuration of the bucket's data retention policy for how long objects in the bucket should be retained. Structure is documented below.
     * 
     */
    @Import(name="retentionPolicy")
      private final @Nullable Output<BucketRetentionPolicyArgs> retentionPolicy;

    public Output<BucketRetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Codegen.empty() : this.retentionPolicy;
    }

    /**
     * The target [Storage Class](https://cloud.google.com/storage/docs/storage-classes) of objects affected by this Lifecycle Rule. Supported values include: `STANDARD`, `MULTI_REGIONAL`, `REGIONAL`, `NEARLINE`, `COLDLINE`, `ARCHIVE`.
     * 
     */
    @Import(name="storageClass")
      private final @Nullable Output<String> storageClass;

    public Output<String> getStorageClass() {
        return this.storageClass == null ? Codegen.empty() : this.storageClass;
    }

    /**
     * Enables [Uniform bucket-level access](https://cloud.google.com/storage/docs/uniform-bucket-level-access) access to a bucket.
     * 
     */
    @Import(name="uniformBucketLevelAccess")
      private final @Nullable Output<Boolean> uniformBucketLevelAccess;

    public Output<Boolean> getUniformBucketLevelAccess() {
        return this.uniformBucketLevelAccess == null ? Codegen.empty() : this.uniformBucketLevelAccess;
    }

    /**
     * The bucket's [Versioning](https://cloud.google.com/storage/docs/object-versioning) configuration.  Structure is documented below.
     * 
     */
    @Import(name="versioning")
      private final @Nullable Output<BucketVersioningArgs> versioning;

    public Output<BucketVersioningArgs> getVersioning() {
        return this.versioning == null ? Codegen.empty() : this.versioning;
    }

    /**
     * Configuration if the bucket acts as a website. Structure is documented below.
     * 
     */
    @Import(name="website")
      private final @Nullable Output<BucketWebsiteArgs> website;

    public Output<BucketWebsiteArgs> getWebsite() {
        return this.website == null ? Codegen.empty() : this.website;
    }

    public BucketArgs(
        @Nullable Output<List<BucketCorArgs>> cors,
        @Nullable Output<Boolean> defaultEventBasedHold,
        @Nullable Output<BucketEncryptionArgs> encryption,
        @Nullable Output<Boolean> forceDestroy,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules,
        Output<String> location,
        @Nullable Output<BucketLoggingArgs> logging,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> publicAccessPrevention,
        @Nullable Output<Boolean> requesterPays,
        @Nullable Output<BucketRetentionPolicyArgs> retentionPolicy,
        @Nullable Output<String> storageClass,
        @Nullable Output<Boolean> uniformBucketLevelAccess,
        @Nullable Output<BucketVersioningArgs> versioning,
        @Nullable Output<BucketWebsiteArgs> website) {
        this.cors = cors;
        this.defaultEventBasedHold = defaultEventBasedHold;
        this.encryption = encryption;
        this.forceDestroy = forceDestroy;
        this.labels = labels;
        this.lifecycleRules = lifecycleRules;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.logging = logging;
        this.name = name;
        this.project = project;
        this.publicAccessPrevention = publicAccessPrevention;
        this.requesterPays = requesterPays;
        this.retentionPolicy = retentionPolicy;
        this.storageClass = storageClass;
        this.uniformBucketLevelAccess = uniformBucketLevelAccess;
        this.versioning = versioning;
        this.website = website;
    }

    private BucketArgs() {
        this.cors = Codegen.empty();
        this.defaultEventBasedHold = Codegen.empty();
        this.encryption = Codegen.empty();
        this.forceDestroy = Codegen.empty();
        this.labels = Codegen.empty();
        this.lifecycleRules = Codegen.empty();
        this.location = Codegen.empty();
        this.logging = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.publicAccessPrevention = Codegen.empty();
        this.requesterPays = Codegen.empty();
        this.retentionPolicy = Codegen.empty();
        this.storageClass = Codegen.empty();
        this.uniformBucketLevelAccess = Codegen.empty();
        this.versioning = Codegen.empty();
        this.website = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BucketCorArgs>> cors;
        private @Nullable Output<Boolean> defaultEventBasedHold;
        private @Nullable Output<BucketEncryptionArgs> encryption;
        private @Nullable Output<Boolean> forceDestroy;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules;
        private Output<String> location;
        private @Nullable Output<BucketLoggingArgs> logging;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> publicAccessPrevention;
        private @Nullable Output<Boolean> requesterPays;
        private @Nullable Output<BucketRetentionPolicyArgs> retentionPolicy;
        private @Nullable Output<String> storageClass;
        private @Nullable Output<Boolean> uniformBucketLevelAccess;
        private @Nullable Output<BucketVersioningArgs> versioning;
        private @Nullable Output<BucketWebsiteArgs> website;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cors = defaults.cors;
    	      this.defaultEventBasedHold = defaults.defaultEventBasedHold;
    	      this.encryption = defaults.encryption;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.labels = defaults.labels;
    	      this.lifecycleRules = defaults.lifecycleRules;
    	      this.location = defaults.location;
    	      this.logging = defaults.logging;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicAccessPrevention = defaults.publicAccessPrevention;
    	      this.requesterPays = defaults.requesterPays;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.storageClass = defaults.storageClass;
    	      this.uniformBucketLevelAccess = defaults.uniformBucketLevelAccess;
    	      this.versioning = defaults.versioning;
    	      this.website = defaults.website;
        }

        public Builder cors(@Nullable Output<List<BucketCorArgs>> cors) {
            this.cors = cors;
            return this;
        }
        public Builder cors(@Nullable List<BucketCorArgs> cors) {
            this.cors = Codegen.ofNullable(cors);
            return this;
        }
        public Builder cors(BucketCorArgs... cors) {
            return cors(List.of(cors));
        }
        public Builder defaultEventBasedHold(@Nullable Output<Boolean> defaultEventBasedHold) {
            this.defaultEventBasedHold = defaultEventBasedHold;
            return this;
        }
        public Builder defaultEventBasedHold(@Nullable Boolean defaultEventBasedHold) {
            this.defaultEventBasedHold = Codegen.ofNullable(defaultEventBasedHold);
            return this;
        }
        public Builder encryption(@Nullable Output<BucketEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable BucketEncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }
        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Codegen.ofNullable(forceDestroy);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder lifecycleRules(@Nullable Output<List<BucketLifecycleRuleArgs>> lifecycleRules) {
            this.lifecycleRules = lifecycleRules;
            return this;
        }
        public Builder lifecycleRules(@Nullable List<BucketLifecycleRuleArgs> lifecycleRules) {
            this.lifecycleRules = Codegen.ofNullable(lifecycleRules);
            return this;
        }
        public Builder lifecycleRules(BucketLifecycleRuleArgs... lifecycleRules) {
            return lifecycleRules(List.of(lifecycleRules));
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder logging(@Nullable Output<BucketLoggingArgs> logging) {
            this.logging = logging;
            return this;
        }
        public Builder logging(@Nullable BucketLoggingArgs logging) {
            this.logging = Codegen.ofNullable(logging);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder publicAccessPrevention(@Nullable Output<String> publicAccessPrevention) {
            this.publicAccessPrevention = publicAccessPrevention;
            return this;
        }
        public Builder publicAccessPrevention(@Nullable String publicAccessPrevention) {
            this.publicAccessPrevention = Codegen.ofNullable(publicAccessPrevention);
            return this;
        }
        public Builder requesterPays(@Nullable Output<Boolean> requesterPays) {
            this.requesterPays = requesterPays;
            return this;
        }
        public Builder requesterPays(@Nullable Boolean requesterPays) {
            this.requesterPays = Codegen.ofNullable(requesterPays);
            return this;
        }
        public Builder retentionPolicy(@Nullable Output<BucketRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public Builder retentionPolicy(@Nullable BucketRetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Codegen.ofNullable(retentionPolicy);
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
        public Builder uniformBucketLevelAccess(@Nullable Output<Boolean> uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = uniformBucketLevelAccess;
            return this;
        }
        public Builder uniformBucketLevelAccess(@Nullable Boolean uniformBucketLevelAccess) {
            this.uniformBucketLevelAccess = Codegen.ofNullable(uniformBucketLevelAccess);
            return this;
        }
        public Builder versioning(@Nullable Output<BucketVersioningArgs> versioning) {
            this.versioning = versioning;
            return this;
        }
        public Builder versioning(@Nullable BucketVersioningArgs versioning) {
            this.versioning = Codegen.ofNullable(versioning);
            return this;
        }
        public Builder website(@Nullable Output<BucketWebsiteArgs> website) {
            this.website = website;
            return this;
        }
        public Builder website(@Nullable BucketWebsiteArgs website) {
            this.website = Codegen.ofNullable(website);
            return this;
        }        public BucketArgs build() {
            return new BucketArgs(cors, defaultEventBasedHold, encryption, forceDestroy, labels, lifecycleRules, location, logging, name, project, publicAccessPrevention, requesterPays, retentionPolicy, storageClass, uniformBucketLevelAccess, versioning, website);
        }
    }
}
