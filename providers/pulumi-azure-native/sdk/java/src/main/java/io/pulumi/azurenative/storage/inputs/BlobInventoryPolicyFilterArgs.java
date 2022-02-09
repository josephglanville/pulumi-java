// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlobInventoryPolicyFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyFilterArgs Empty = new BlobInventoryPolicyFilterArgs();

    @InputImport(name="blobTypes", required=true)
    private final Input<List<String>> blobTypes;

    public Input<List<String>> getBlobTypes() {
        return this.blobTypes;
    }

    @InputImport(name="includeBlobVersions")
    private final @Nullable Input<Boolean> includeBlobVersions;

    public Input<Boolean> getIncludeBlobVersions() {
        return this.includeBlobVersions == null ? Input.empty() : this.includeBlobVersions;
    }

    @InputImport(name="includeSnapshots")
    private final @Nullable Input<Boolean> includeSnapshots;

    public Input<Boolean> getIncludeSnapshots() {
        return this.includeSnapshots == null ? Input.empty() : this.includeSnapshots;
    }

    @InputImport(name="prefixMatch")
    private final @Nullable Input<List<String>> prefixMatch;

    public Input<List<String>> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    public BlobInventoryPolicyFilterArgs(
        Input<List<String>> blobTypes,
        @Nullable Input<Boolean> includeBlobVersions,
        @Nullable Input<Boolean> includeSnapshots,
        @Nullable Input<List<String>> prefixMatch) {
        this.blobTypes = Objects.requireNonNull(blobTypes, "expected parameter 'blobTypes' to be non-null");
        this.includeBlobVersions = includeBlobVersions;
        this.includeSnapshots = includeSnapshots;
        this.prefixMatch = prefixMatch;
    }

    private BlobInventoryPolicyFilterArgs() {
        this.blobTypes = Input.empty();
        this.includeBlobVersions = Input.empty();
        this.includeSnapshots = Input.empty();
        this.prefixMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> blobTypes;
        private @Nullable Input<Boolean> includeBlobVersions;
        private @Nullable Input<Boolean> includeSnapshots;
        private @Nullable Input<List<String>> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.includeBlobVersions = defaults.includeBlobVersions;
    	      this.includeSnapshots = defaults.includeSnapshots;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder setBlobTypes(Input<List<String>> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }

        public Builder setBlobTypes(List<String> blobTypes) {
            this.blobTypes = Input.of(Objects.requireNonNull(blobTypes));
            return this;
        }

        public Builder setIncludeBlobVersions(@Nullable Input<Boolean> includeBlobVersions) {
            this.includeBlobVersions = includeBlobVersions;
            return this;
        }

        public Builder setIncludeBlobVersions(@Nullable Boolean includeBlobVersions) {
            this.includeBlobVersions = Input.ofNullable(includeBlobVersions);
            return this;
        }

        public Builder setIncludeSnapshots(@Nullable Input<Boolean> includeSnapshots) {
            this.includeSnapshots = includeSnapshots;
            return this;
        }

        public Builder setIncludeSnapshots(@Nullable Boolean includeSnapshots) {
            this.includeSnapshots = Input.ofNullable(includeSnapshots);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<List<String>> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public BlobInventoryPolicyFilterArgs build() {
            return new BlobInventoryPolicyFilterArgs(blobTypes, includeBlobVersions, includeSnapshots, prefixMatch);
        }
    }
}
