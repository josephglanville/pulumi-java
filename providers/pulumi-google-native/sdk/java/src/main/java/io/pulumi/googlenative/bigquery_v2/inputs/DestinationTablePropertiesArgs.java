// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DestinationTablePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationTablePropertiesArgs Empty = new DestinationTablePropertiesArgs();

    /**
     * [Optional] The description for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the current description is provided, the job will fail.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * [Internal] This field is for Google internal use only.
     * 
     */
    @Import(name="expirationTime")
      private final @Nullable Output<String> expirationTime;

    public Output<String> getExpirationTime() {
        return this.expirationTime == null ? Output.empty() : this.expirationTime;
    }

    /**
     * [Optional] The friendly name for the destination table. This will only be used if the destination table is newly created. If the table already exists and a value different than the current friendly name is provided, the job will fail.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * [Optional] The labels associated with this table. You can use these to organize and group your tables. This will only be used if the destination table is newly created. If the table already exists and labels are different than the current labels are provided, the job will fail.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    public DestinationTablePropertiesArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> expirationTime,
        @Nullable Output<String> friendlyName,
        @Nullable Output<Map<String,String>> labels) {
        this.description = description;
        this.expirationTime = expirationTime;
        this.friendlyName = friendlyName;
        this.labels = labels;
    }

    private DestinationTablePropertiesArgs() {
        this.description = Output.empty();
        this.expirationTime = Output.empty();
        this.friendlyName = Output.empty();
        this.labels = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationTablePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> expirationTime;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<Map<String,String>> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationTablePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.expirationTime = defaults.expirationTime;
    	      this.friendlyName = defaults.friendlyName;
    	      this.labels = defaults.labels;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder expirationTime(@Nullable Output<String> expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Builder expirationTime(@Nullable String expirationTime) {
            this.expirationTime = Output.ofNullable(expirationTime);
            return this;
        }
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }        public DestinationTablePropertiesArgs build() {
            return new DestinationTablePropertiesArgs(description, expirationTime, friendlyName, labels);
        }
    }
}
