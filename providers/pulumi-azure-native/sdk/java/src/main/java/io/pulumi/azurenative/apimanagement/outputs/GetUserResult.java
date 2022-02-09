// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.GroupContractPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.UserIdentityContractResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetUserResult {
    private final @Nullable String email;
    private final @Nullable String firstName;
    private final List<GroupContractPropertiesResponse> groups;
    private final String id;
    private final @Nullable List<UserIdentityContractResponse> identities;
    private final @Nullable String lastName;
    private final String name;
    private final @Nullable String note;
    private final @Nullable String registrationDate;
    private final @Nullable String state;
    private final String type;

    @OutputCustomType.Constructor({"email","firstName","groups","id","identities","lastName","name","note","registrationDate","state","type"})
    private GetUserResult(
        @Nullable String email,
        @Nullable String firstName,
        List<GroupContractPropertiesResponse> groups,
        String id,
        @Nullable List<UserIdentityContractResponse> identities,
        @Nullable String lastName,
        String name,
        @Nullable String note,
        @Nullable String registrationDate,
        @Nullable String state,
        String type) {
        this.email = email;
        this.firstName = firstName;
        this.groups = Objects.requireNonNull(groups);
        this.id = Objects.requireNonNull(id);
        this.identities = identities;
        this.lastName = lastName;
        this.name = Objects.requireNonNull(name);
        this.note = note;
        this.registrationDate = registrationDate;
        this.state = state;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(this.email);
    }
    public Optional<String> getFirstName() {
        return Optional.ofNullable(this.firstName);
    }
    public List<GroupContractPropertiesResponse> getGroups() {
        return this.groups;
    }
    public String getId() {
        return this.id;
    }
    public List<UserIdentityContractResponse> getIdentities() {
        return this.identities == null ? List.of() : this.identities;
    }
    public Optional<String> getLastName() {
        return Optional.ofNullable(this.lastName);
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNote() {
        return Optional.ofNullable(this.note);
    }
    public Optional<String> getRegistrationDate() {
        return Optional.ofNullable(this.registrationDate);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String firstName;
        private List<GroupContractPropertiesResponse> groups;
        private String id;
        private @Nullable List<UserIdentityContractResponse> identities;
        private @Nullable String lastName;
        private String name;
        private @Nullable String note;
        private @Nullable String registrationDate;
        private @Nullable String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.lastName = defaults.lastName;
    	      this.name = defaults.name;
    	      this.note = defaults.note;
    	      this.registrationDate = defaults.registrationDate;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setGroups(List<GroupContractPropertiesResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentities(@Nullable List<UserIdentityContractResponse> identities) {
            this.identities = identities;
            return this;
        }

        public Builder setLastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNote(@Nullable String note) {
            this.note = note;
            return this;
        }

        public Builder setRegistrationDate(@Nullable String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetUserResult build() {
            return new GetUserResult(email, firstName, groups, id, identities, lastName, name, note, registrationDate, state, type);
        }
    }
}
