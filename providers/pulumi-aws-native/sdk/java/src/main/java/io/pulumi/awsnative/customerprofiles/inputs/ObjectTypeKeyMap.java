// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.inputs;

import io.pulumi.awsnative.customerprofiles.inputs.ObjectTypeKey;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectTypeKeyMap extends io.pulumi.resources.InvokeArgs {

    public static final ObjectTypeKeyMap Empty = new ObjectTypeKeyMap();

    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="objectTypeKeyList")
      private final @Nullable List<ObjectTypeKey> objectTypeKeyList;

    public List<ObjectTypeKey> getObjectTypeKeyList() {
        return this.objectTypeKeyList == null ? List.of() : this.objectTypeKeyList;
    }

    public ObjectTypeKeyMap(
        @Nullable String name,
        @Nullable List<ObjectTypeKey> objectTypeKeyList) {
        this.name = name;
        this.objectTypeKeyList = objectTypeKeyList;
    }

    private ObjectTypeKeyMap() {
        this.name = null;
        this.objectTypeKeyList = List.of();
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

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setObjectTypeKeyList(@Nullable List<ObjectTypeKey> objectTypeKeyList) {
            this.objectTypeKeyList = objectTypeKeyList;
            return this;
        }
        public ObjectTypeKeyMap build() {
            return new ObjectTypeKeyMap(name, objectTypeKeyList);
        }
    }
}
