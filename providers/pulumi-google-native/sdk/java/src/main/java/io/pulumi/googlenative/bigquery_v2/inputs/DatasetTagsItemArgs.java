// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetTagsItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetTagsItemArgs Empty = new DatasetTagsItemArgs();

    /**
     * [Required] The namespaced friendly name of the tag key, e.g. "12345/environment" where 12345 is org id.
     * 
     */
    @Import(name="tagKey")
      private final @Nullable Output<String> tagKey;

    public Output<String> getTagKey() {
        return this.tagKey == null ? Output.empty() : this.tagKey;
    }

    /**
     * [Required] Friendly short name of the tag value, e.g. "production".
     * 
     */
    @Import(name="tagValue")
      private final @Nullable Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue == null ? Output.empty() : this.tagValue;
    }

    public DatasetTagsItemArgs(
        @Nullable Output<String> tagKey,
        @Nullable Output<String> tagValue) {
        this.tagKey = tagKey;
        this.tagValue = tagValue;
    }

    private DatasetTagsItemArgs() {
        this.tagKey = Output.empty();
        this.tagValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetTagsItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> tagKey;
        private @Nullable Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetTagsItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagKey = defaults.tagKey;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder tagKey(@Nullable Output<String> tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public Builder tagKey(@Nullable String tagKey) {
            this.tagKey = Output.ofNullable(tagKey);
            return this;
        }
        public Builder tagValue(@Nullable Output<String> tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public Builder tagValue(@Nullable String tagValue) {
            this.tagValue = Output.ofNullable(tagValue);
            return this;
        }        public DatasetTagsItemArgs build() {
            return new DatasetTagsItemArgs(tagKey, tagValue);
        }
    }
}
