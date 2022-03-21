// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.outputs;

import io.pulumi.awsnative.glue.enums.SchemaCompatibility;
import io.pulumi.awsnative.glue.outputs.SchemaTag;
import io.pulumi.awsnative.glue.outputs.SchemaVersion;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSchemaResult {
    /**
     * Amazon Resource Name for the Schema.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable SchemaVersion checkpointVersion;
    /**
     * Compatibility setting for the schema.
     * 
     */
    private final @Nullable SchemaCompatibility compatibility;
    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
     */
    private final @Nullable String description;
    /**
     * Represents the version ID associated with the initial schema version.
     * 
     */
    private final @Nullable String initialSchemaVersionId;
    /**
     * List of tags to tag the schema
     * 
     */
    private final @Nullable List<SchemaTag> tags;

    @CustomType.Constructor
    private GetSchemaResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("checkpointVersion") @Nullable SchemaVersion checkpointVersion,
        @CustomType.Parameter("compatibility") @Nullable SchemaCompatibility compatibility,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("initialSchemaVersionId") @Nullable String initialSchemaVersionId,
        @CustomType.Parameter("tags") @Nullable List<SchemaTag> tags) {
        this.arn = arn;
        this.checkpointVersion = checkpointVersion;
        this.compatibility = compatibility;
        this.description = description;
        this.initialSchemaVersionId = initialSchemaVersionId;
        this.tags = tags;
    }

    /**
     * Amazon Resource Name for the Schema.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<SchemaVersion> getCheckpointVersion() {
        return Optional.ofNullable(this.checkpointVersion);
    }
    /**
     * Compatibility setting for the schema.
     * 
    */
    public Optional<SchemaCompatibility> getCompatibility() {
        return Optional.ofNullable(this.compatibility);
    }
    /**
     * A description of the schema. If description is not provided, there will not be any default value for this.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Represents the version ID associated with the initial schema version.
     * 
    */
    public Optional<String> getInitialSchemaVersionId() {
        return Optional.ofNullable(this.initialSchemaVersionId);
    }
    /**
     * List of tags to tag the schema
     * 
    */
    public List<SchemaTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable SchemaVersion checkpointVersion;
        private @Nullable SchemaCompatibility compatibility;
        private @Nullable String description;
        private @Nullable String initialSchemaVersionId;
        private @Nullable List<SchemaTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.checkpointVersion = defaults.checkpointVersion;
    	      this.compatibility = defaults.compatibility;
    	      this.description = defaults.description;
    	      this.initialSchemaVersionId = defaults.initialSchemaVersionId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder checkpointVersion(@Nullable SchemaVersion checkpointVersion) {
            this.checkpointVersion = checkpointVersion;
            return this;
        }
        public Builder compatibility(@Nullable SchemaCompatibility compatibility) {
            this.compatibility = compatibility;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder initialSchemaVersionId(@Nullable String initialSchemaVersionId) {
            this.initialSchemaVersionId = initialSchemaVersionId;
            return this;
        }
        public Builder tags(@Nullable List<SchemaTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(SchemaTag... tags) {
            return tags(List.of(tags));
        }        public GetSchemaResult build() {
            return new GetSchemaResult(arn, checkpointVersion, compatibility, description, initialSchemaVersionId, tags);
        }
    }
}
