// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BlobInventoryPolicyFilterResponse {
    private final List<String> blobTypes;
    private final @Nullable Boolean includeBlobVersions;
    private final @Nullable Boolean includeSnapshots;
    private final @Nullable List<String> prefixMatch;

    @OutputCustomType.Constructor({"blobTypes","includeBlobVersions","includeSnapshots","prefixMatch"})
    private BlobInventoryPolicyFilterResponse(
        List<String> blobTypes,
        @Nullable Boolean includeBlobVersions,
        @Nullable Boolean includeSnapshots,
        @Nullable List<String> prefixMatch) {
        this.blobTypes = Objects.requireNonNull(blobTypes);
        this.includeBlobVersions = includeBlobVersions;
        this.includeSnapshots = includeSnapshots;
        this.prefixMatch = prefixMatch;
    }

    public List<String> getBlobTypes() {
        return this.blobTypes;
    }
    public Optional<Boolean> getIncludeBlobVersions() {
        return Optional.ofNullable(this.includeBlobVersions);
    }
    public Optional<Boolean> getIncludeSnapshots() {
        return Optional.ofNullable(this.includeSnapshots);
    }
    public List<String> getPrefixMatch() {
        return this.prefixMatch == null ? List.of() : this.prefixMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> blobTypes;
        private @Nullable Boolean includeBlobVersions;
        private @Nullable Boolean includeSnapshots;
        private @Nullable List<String> prefixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobTypes = defaults.blobTypes;
    	      this.includeBlobVersions = defaults.includeBlobVersions;
    	      this.includeSnapshots = defaults.includeSnapshots;
    	      this.prefixMatch = defaults.prefixMatch;
        }

        public Builder setBlobTypes(List<String> blobTypes) {
            this.blobTypes = Objects.requireNonNull(blobTypes);
            return this;
        }

        public Builder setIncludeBlobVersions(@Nullable Boolean includeBlobVersions) {
            this.includeBlobVersions = includeBlobVersions;
            return this;
        }

        public Builder setIncludeSnapshots(@Nullable Boolean includeSnapshots) {
            this.includeSnapshots = includeSnapshots;
            return this;
        }

        public Builder setPrefixMatch(@Nullable List<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public BlobInventoryPolicyFilterResponse build() {
            return new BlobInventoryPolicyFilterResponse(blobTypes, includeBlobVersions, includeSnapshots, prefixMatch);
        }
    }
}
