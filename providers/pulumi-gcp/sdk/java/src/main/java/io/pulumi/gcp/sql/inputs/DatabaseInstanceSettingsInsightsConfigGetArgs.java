// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsInsightsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsInsightsConfigGetArgs Empty = new DatabaseInstanceSettingsInsightsConfigGetArgs();

    @InputImport(name="queryInsightsEnabled")
    private final @Nullable Input<Boolean> queryInsightsEnabled;

    public Input<Boolean> getQueryInsightsEnabled() {
        return this.queryInsightsEnabled == null ? Input.empty() : this.queryInsightsEnabled;
    }

    @InputImport(name="queryStringLength")
    private final @Nullable Input<Integer> queryStringLength;

    public Input<Integer> getQueryStringLength() {
        return this.queryStringLength == null ? Input.empty() : this.queryStringLength;
    }

    @InputImport(name="recordApplicationTags")
    private final @Nullable Input<Boolean> recordApplicationTags;

    public Input<Boolean> getRecordApplicationTags() {
        return this.recordApplicationTags == null ? Input.empty() : this.recordApplicationTags;
    }

    @InputImport(name="recordClientAddress")
    private final @Nullable Input<Boolean> recordClientAddress;

    public Input<Boolean> getRecordClientAddress() {
        return this.recordClientAddress == null ? Input.empty() : this.recordClientAddress;
    }

    public DatabaseInstanceSettingsInsightsConfigGetArgs(
        @Nullable Input<Boolean> queryInsightsEnabled,
        @Nullable Input<Integer> queryStringLength,
        @Nullable Input<Boolean> recordApplicationTags,
        @Nullable Input<Boolean> recordClientAddress) {
        this.queryInsightsEnabled = queryInsightsEnabled;
        this.queryStringLength = queryStringLength;
        this.recordApplicationTags = recordApplicationTags;
        this.recordClientAddress = recordClientAddress;
    }

    private DatabaseInstanceSettingsInsightsConfigGetArgs() {
        this.queryInsightsEnabled = Input.empty();
        this.queryStringLength = Input.empty();
        this.recordApplicationTags = Input.empty();
        this.recordClientAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsInsightsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> queryInsightsEnabled;
        private @Nullable Input<Integer> queryStringLength;
        private @Nullable Input<Boolean> recordApplicationTags;
        private @Nullable Input<Boolean> recordClientAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsInsightsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        public Builder setQueryInsightsEnabled(@Nullable Input<Boolean> queryInsightsEnabled) {
            this.queryInsightsEnabled = queryInsightsEnabled;
            return this;
        }

        public Builder setQueryInsightsEnabled(@Nullable Boolean queryInsightsEnabled) {
            this.queryInsightsEnabled = Input.ofNullable(queryInsightsEnabled);
            return this;
        }

        public Builder setQueryStringLength(@Nullable Input<Integer> queryStringLength) {
            this.queryStringLength = queryStringLength;
            return this;
        }

        public Builder setQueryStringLength(@Nullable Integer queryStringLength) {
            this.queryStringLength = Input.ofNullable(queryStringLength);
            return this;
        }

        public Builder setRecordApplicationTags(@Nullable Input<Boolean> recordApplicationTags) {
            this.recordApplicationTags = recordApplicationTags;
            return this;
        }

        public Builder setRecordApplicationTags(@Nullable Boolean recordApplicationTags) {
            this.recordApplicationTags = Input.ofNullable(recordApplicationTags);
            return this;
        }

        public Builder setRecordClientAddress(@Nullable Input<Boolean> recordClientAddress) {
            this.recordClientAddress = recordClientAddress;
            return this;
        }

        public Builder setRecordClientAddress(@Nullable Boolean recordClientAddress) {
            this.recordClientAddress = Input.ofNullable(recordClientAddress);
            return this;
        }

        public DatabaseInstanceSettingsInsightsConfigGetArgs build() {
            return new DatabaseInstanceSettingsInsightsConfigGetArgs(queryInsightsEnabled, queryStringLength, recordApplicationTags, recordClientAddress);
        }
    }
}