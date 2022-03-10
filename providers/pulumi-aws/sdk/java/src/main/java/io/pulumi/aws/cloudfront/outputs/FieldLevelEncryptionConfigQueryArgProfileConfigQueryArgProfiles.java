// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles {
    private final @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items;

    @OutputCustomType.Constructor
    private FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles(@OutputCustomType.Parameter("items") @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items) {
        this.items = items;
    }

    public List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> getItems() {
        return this.items == null ? List.of() : this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable List<FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItem> items) {
            this.items = items;
            return this;
        }
        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles build() {
            return new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfiles(items);
        }
    }
}
