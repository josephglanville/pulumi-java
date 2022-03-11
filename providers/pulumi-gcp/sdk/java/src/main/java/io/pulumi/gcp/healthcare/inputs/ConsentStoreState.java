// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsentStoreState extends io.pulumi.resources.ResourceArgs {

    public static final ConsentStoreState Empty = new ConsentStoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @InputImport(name="dataset")
      private final @Nullable Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset == null ? Output.empty() : this.dataset;
    }

    /**
     * Default time to live for consents in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @InputImport(name="defaultConsentTtl")
      private final @Nullable Output<String> defaultConsentTtl;

    public Output<String> getDefaultConsentTtl() {
        return this.defaultConsentTtl == null ? Output.empty() : this.defaultConsentTtl;
    }

    /**
     * If true, [consents.patch] [google.cloud.healthcare.v1.consent.UpdateConsent] creates the consent if it does not already exist.
     * 
     */
    @InputImport(name="enableConsentCreateOnUpdate")
      private final @Nullable Output<Boolean> enableConsentCreateOnUpdate;

    public Output<Boolean> getEnableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate == null ? Output.empty() : this.enableConsentCreateOnUpdate;
    }

    /**
     * User-supplied key-value pairs used to organize Consent stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}`
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}`
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The name of this ConsentStore, for example:
     * "consent1"
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public ConsentStoreState(
        @Nullable Output<String> dataset,
        @Nullable Output<String> defaultConsentTtl,
        @Nullable Output<Boolean> enableConsentCreateOnUpdate,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name) {
        this.dataset = dataset;
        this.defaultConsentTtl = defaultConsentTtl;
        this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
        this.labels = labels;
        this.name = name;
    }

    private ConsentStoreState() {
        this.dataset = Output.empty();
        this.defaultConsentTtl = Output.empty();
        this.enableConsentCreateOnUpdate = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsentStoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataset;
        private @Nullable Output<String> defaultConsentTtl;
        private @Nullable Output<Boolean> enableConsentCreateOnUpdate;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsentStoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder dataset(@Nullable Output<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder dataset(@Nullable String dataset) {
            this.dataset = Output.ofNullable(dataset);
            return this;
        }

        public Builder defaultConsentTtl(@Nullable Output<String> defaultConsentTtl) {
            this.defaultConsentTtl = defaultConsentTtl;
            return this;
        }

        public Builder defaultConsentTtl(@Nullable String defaultConsentTtl) {
            this.defaultConsentTtl = Output.ofNullable(defaultConsentTtl);
            return this;
        }

        public Builder enableConsentCreateOnUpdate(@Nullable Output<Boolean> enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
            return this;
        }

        public Builder enableConsentCreateOnUpdate(@Nullable Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Output.ofNullable(enableConsentCreateOnUpdate);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public ConsentStoreState build() {
            return new ConsentStoreState(dataset, defaultConsentTtl, enableConsentCreateOnUpdate, labels, name);
        }
    }
}
