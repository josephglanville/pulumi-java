// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioSessionMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioSessionMappingArgs Empty = new StudioSessionMappingArgs();

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityId")
      private final @Nullable Output<String> identityId;

    public Output<String> getIdentityId() {
        return this.identityId == null ? Output.empty() : this.identityId;
    }

    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @Import(name="identityName")
      private final @Nullable Output<String> identityName;

    public Output<String> getIdentityName() {
        return this.identityName == null ? Output.empty() : this.identityName;
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @Import(name="identityType", required=true)
      private final Output<String> identityType;

    public Output<String> getIdentityType() {
        return this.identityType;
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @Import(name="sessionPolicyArn", required=true)
      private final Output<String> sessionPolicyArn;

    public Output<String> getSessionPolicyArn() {
        return this.sessionPolicyArn;
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Import(name="studioId", required=true)
      private final Output<String> studioId;

    public Output<String> getStudioId() {
        return this.studioId;
    }

    public StudioSessionMappingArgs(
        @Nullable Output<String> identityId,
        @Nullable Output<String> identityName,
        Output<String> identityType,
        Output<String> sessionPolicyArn,
        Output<String> studioId) {
        this.identityId = identityId;
        this.identityName = identityName;
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.sessionPolicyArn = Objects.requireNonNull(sessionPolicyArn, "expected parameter 'sessionPolicyArn' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private StudioSessionMappingArgs() {
        this.identityId = Output.empty();
        this.identityName = Output.empty();
        this.identityType = Output.empty();
        this.sessionPolicyArn = Output.empty();
        this.studioId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioSessionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> identityId;
        private @Nullable Output<String> identityName;
        private Output<String> identityType;
        private Output<String> sessionPolicyArn;
        private Output<String> studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioSessionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityId = defaults.identityId;
    	      this.identityName = defaults.identityName;
    	      this.identityType = defaults.identityType;
    	      this.sessionPolicyArn = defaults.sessionPolicyArn;
    	      this.studioId = defaults.studioId;
        }

        public Builder identityId(@Nullable Output<String> identityId) {
            this.identityId = identityId;
            return this;
        }
        public Builder identityId(@Nullable String identityId) {
            this.identityId = Output.ofNullable(identityId);
            return this;
        }
        public Builder identityName(@Nullable Output<String> identityName) {
            this.identityName = identityName;
            return this;
        }
        public Builder identityName(@Nullable String identityName) {
            this.identityName = Output.ofNullable(identityName);
            return this;
        }
        public Builder identityType(Output<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }
        public Builder identityType(String identityType) {
            this.identityType = Output.of(Objects.requireNonNull(identityType));
            return this;
        }
        public Builder sessionPolicyArn(Output<String> sessionPolicyArn) {
            this.sessionPolicyArn = Objects.requireNonNull(sessionPolicyArn);
            return this;
        }
        public Builder sessionPolicyArn(String sessionPolicyArn) {
            this.sessionPolicyArn = Output.of(Objects.requireNonNull(sessionPolicyArn));
            return this;
        }
        public Builder studioId(Output<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }
        public Builder studioId(String studioId) {
            this.studioId = Output.of(Objects.requireNonNull(studioId));
            return this;
        }        public StudioSessionMappingArgs build() {
            return new StudioSessionMappingArgs(identityId, identityName, identityType, sessionPolicyArn, studioId);
        }
    }
}