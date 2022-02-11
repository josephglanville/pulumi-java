// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.DownwardAPIVolumeFile;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DownwardAPIProjection {
    private final @Nullable List<DownwardAPIVolumeFile> items;

    @OutputCustomType.Constructor({"items"})
    private DownwardAPIProjection(@Nullable List<DownwardAPIVolumeFile> items) {
        this.items = items;
    }

    public List<DownwardAPIVolumeFile> getItems() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DownwardAPIProjection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DownwardAPIVolumeFile> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DownwardAPIProjection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable List<DownwardAPIVolumeFile> items) {
            this.items = items;
            return this;
        }

        public DownwardAPIProjection build() {
            return new DownwardAPIProjection(items);
        }
    }
}
