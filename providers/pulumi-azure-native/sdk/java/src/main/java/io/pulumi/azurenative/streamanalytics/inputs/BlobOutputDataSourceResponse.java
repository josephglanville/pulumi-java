// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.StorageAccountResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BlobOutputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final BlobOutputDataSourceResponse Empty = new BlobOutputDataSourceResponse();

    @InputImport(name="container")
    private final @Nullable String container;

    public Optional<String> getContainer() {
        return this.container == null ? Optional.empty() : Optional.ofNullable(this.container);
    }

    @InputImport(name="dateFormat")
    private final @Nullable String dateFormat;

    public Optional<String> getDateFormat() {
        return this.dateFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFormat);
    }

    @InputImport(name="pathPattern")
    private final @Nullable String pathPattern;

    public Optional<String> getPathPattern() {
        return this.pathPattern == null ? Optional.empty() : Optional.ofNullable(this.pathPattern);
    }

    @InputImport(name="storageAccounts")
    private final @Nullable List<StorageAccountResponse> storageAccounts;

    public List<StorageAccountResponse> getStorageAccounts() {
        return this.storageAccounts == null ? List.of() : this.storageAccounts;
    }

    @InputImport(name="timeFormat")
    private final @Nullable String timeFormat;

    public Optional<String> getTimeFormat() {
        return this.timeFormat == null ? Optional.empty() : Optional.ofNullable(this.timeFormat);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public BlobOutputDataSourceResponse(
        @Nullable String container,
        @Nullable String dateFormat,
        @Nullable String pathPattern,
        @Nullable List<StorageAccountResponse> storageAccounts,
        @Nullable String timeFormat,
        String type) {
        this.container = container;
        this.dateFormat = dateFormat;
        this.pathPattern = pathPattern;
        this.storageAccounts = storageAccounts;
        this.timeFormat = timeFormat;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private BlobOutputDataSourceResponse() {
        this.container = null;
        this.dateFormat = null;
        this.pathPattern = null;
        this.storageAccounts = List.of();
        this.timeFormat = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobOutputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String container;
        private @Nullable String dateFormat;
        private @Nullable String pathPattern;
        private @Nullable List<StorageAccountResponse> storageAccounts;
        private @Nullable String timeFormat;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobOutputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.dateFormat = defaults.dateFormat;
    	      this.pathPattern = defaults.pathPattern;
    	      this.storageAccounts = defaults.storageAccounts;
    	      this.timeFormat = defaults.timeFormat;
    	      this.type = defaults.type;
        }

        public Builder setContainer(@Nullable String container) {
            this.container = container;
            return this;
        }

        public Builder setDateFormat(@Nullable String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setPathPattern(@Nullable String pathPattern) {
            this.pathPattern = pathPattern;
            return this;
        }

        public Builder setStorageAccounts(@Nullable List<StorageAccountResponse> storageAccounts) {
            this.storageAccounts = storageAccounts;
            return this;
        }

        public Builder setTimeFormat(@Nullable String timeFormat) {
            this.timeFormat = timeFormat;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public BlobOutputDataSourceResponse build() {
            return new BlobOutputDataSourceResponse(container, dateFormat, pathPattern, storageAccounts, timeFormat, type);
        }
    }
}
