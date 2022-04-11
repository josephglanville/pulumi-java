// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreArgs Empty = new ConsentStoreArgs();

    @Import(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * 
     */
    @Import(name="defaultConsentTtl")
      private final @Nullable Output<String> defaultConsentTtl;

    public Output<String> getDefaultConsentTtl() {
        return this.defaultConsentTtl == null ? Codegen.empty() : this.defaultConsentTtl;
    }

    /**
     * Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
     * 
     */
    @Import(name="enableConsentCreateOnUpdate")
      private final @Nullable Output<Boolean> enableConsentCreateOnUpdate;

    public Output<Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate == null ? Codegen.empty() : this.enableConsentCreateOnUpdate;
    }

    /**
     * Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ConsentStoreArgs(
        Output<String> consentStoreId,
        Output<String> datasetId,
        @Nullable Output<String> defaultConsentTtl,
        @Nullable Output<Boolean> enableConsentCreateOnUpdate,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.defaultConsentTtl = defaultConsentTtl;
        this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private ConsentStoreArgs() {
        this.consentStoreId = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.defaultConsentTtl = Codegen.empty();
        this.enableConsentCreateOnUpdate = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> consentStoreId;
        private Output<String> datasetId;
        private @Nullable Output<String> defaultConsentTtl;
        private @Nullable Output<Boolean> enableConsentCreateOnUpdate;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.datasetId = defaults.datasetId;
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }
        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder defaultConsentTtl(@Nullable Output<String> defaultConsentTtl) {
            this.defaultConsentTtl = defaultConsentTtl;
            return this;
        }
        public Builder defaultConsentTtl(@Nullable String defaultConsentTtl) {
            this.defaultConsentTtl = Codegen.ofNullable(defaultConsentTtl);
            return this;
        }
        public Builder enableConsentCreateOnUpdate(@Nullable Output<Boolean> enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
            return this;
        }
        public Builder enableConsentCreateOnUpdate(@Nullable Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Codegen.ofNullable(enableConsentCreateOnUpdate);
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        }        public ConsentStoreArgs build() {
            return new ConsentStoreArgs(consentStoreId, datasetId, defaultConsentTtl, enableConsentCreateOnUpdate, labels, location, name, project);
        }
    }
}
