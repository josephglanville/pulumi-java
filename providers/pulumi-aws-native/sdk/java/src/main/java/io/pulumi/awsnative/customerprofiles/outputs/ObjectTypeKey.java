// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.customerprofiles.outputs;

import io.pulumi.awsnative.customerprofiles.enums.ObjectTypeKeyStandardIdentifiersItem;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ObjectTypeKey {
    /**
     * The reference for the key name of the fields map.
     * 
     */
    private final @Nullable List<String> fieldNames;
    /**
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * 
     */
    private final @Nullable List<ObjectTypeKeyStandardIdentifiersItem> standardIdentifiers;

    @CustomType.Constructor
    private ObjectTypeKey(
        @CustomType.Parameter("fieldNames") @Nullable List<String> fieldNames,
        @CustomType.Parameter("standardIdentifiers") @Nullable List<ObjectTypeKeyStandardIdentifiersItem> standardIdentifiers) {
        this.fieldNames = fieldNames;
        this.standardIdentifiers = standardIdentifiers;
    }

    /**
     * The reference for the key name of the fields map.
     * 
    */
    public List<String> getFieldNames() {
        return this.fieldNames == null ? List.of() : this.fieldNames;
    }
    /**
     * The types of keys that a ProfileObject can have. Each ProfileObject can have only 1 UNIQUE key but multiple PROFILE keys. PROFILE means that this key can be used to tie an object to a PROFILE. UNIQUE means that it can be used to uniquely identify an object. If a key a is marked as SECONDARY, it will be used to search for profiles after all other PROFILE keys have been searched. A LOOKUP_ONLY key is only used to match a profile but is not persisted to be used for searching of the profile. A NEW_ONLY key is only used if the profile does not already exist before the object is ingested, otherwise it is only used for matching objects to profiles.
     * 
    */
    public List<ObjectTypeKeyStandardIdentifiersItem> getStandardIdentifiers() {
        return this.standardIdentifiers == null ? List.of() : this.standardIdentifiers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> fieldNames;
        private @Nullable List<ObjectTypeKeyStandardIdentifiersItem> standardIdentifiers;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldNames = defaults.fieldNames;
    	      this.standardIdentifiers = defaults.standardIdentifiers;
        }

        public Builder fieldNames(@Nullable List<String> fieldNames) {
            this.fieldNames = fieldNames;
            return this;
        }
        public Builder fieldNames(String... fieldNames) {
            return fieldNames(List.of(fieldNames));
        }
        public Builder standardIdentifiers(@Nullable List<ObjectTypeKeyStandardIdentifiersItem> standardIdentifiers) {
            this.standardIdentifiers = standardIdentifiers;
            return this;
        }
        public Builder standardIdentifiers(ObjectTypeKeyStandardIdentifiersItem... standardIdentifiers) {
            return standardIdentifiers(List.of(standardIdentifiers));
        }        public ObjectTypeKey build() {
            return new ObjectTypeKey(fieldNames, standardIdentifiers);
        }
    }
}
