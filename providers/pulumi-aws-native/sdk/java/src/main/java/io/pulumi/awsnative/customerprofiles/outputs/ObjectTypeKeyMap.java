// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.outputs.ObjectTypeKey;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectTypeKeyMap {
    private final @Nullable String name;
    private final @Nullable List<ObjectTypeKey> objectTypeKeyList;

    @CustomType.Constructor
    private ObjectTypeKeyMap(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("objectTypeKeyList") @Nullable List<ObjectTypeKey> objectTypeKeyList) {
        this.name = name;
        this.objectTypeKeyList = objectTypeKeyList;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public List<ObjectTypeKey> getObjectTypeKeyList() {
        return this.objectTypeKeyList == null ? List.of() : this.objectTypeKeyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeKeyMap defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<ObjectTypeKey> objectTypeKeyList;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeKeyMap defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.objectTypeKeyList = defaults.objectTypeKeyList;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder objectTypeKeyList(@Nullable List<ObjectTypeKey> objectTypeKeyList) {
            this.objectTypeKeyList = objectTypeKeyList;
            return this;
        }
        public Builder objectTypeKeyList(ObjectTypeKey... objectTypeKeyList) {
            return objectTypeKeyList(List.of(objectTypeKeyList));
        }        public ObjectTypeKeyMap build() {
            return new ObjectTypeKeyMap(name, objectTypeKeyList);
        }
    }
}
