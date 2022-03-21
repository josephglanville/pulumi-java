// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The call participant speaking for a given utterance.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1ConversationParticipantResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1ConversationParticipantResponse Empty = new GoogleCloudContactcenterinsightsV1ConversationParticipantResponse();

    /**
     * The name of the participant provided by Dialogflow. Format: projects/{project}/locations/{location}/conversations/{conversation}/participants/{participant}
     * 
     */
    @Import(name="dialogflowParticipantName", required=true)
      private final String dialogflowParticipantName;

    public String getDialogflowParticipantName() {
        return this.dialogflowParticipantName;
    }

    /**
     * Obfuscated user ID from Dialogflow.
     * 
     */
    @Import(name="obfuscatedExternalUserId", required=true)
      private final String obfuscatedExternalUserId;

    public String getObfuscatedExternalUserId() {
        return this.obfuscatedExternalUserId;
    }

    /**
     * The role of the participant.
     * 
     */
    @Import(name="role", required=true)
      private final String role;

    public String getRole() {
        return this.role;
    }

    /**
     * A user-specified ID representing the participant.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    public GoogleCloudContactcenterinsightsV1ConversationParticipantResponse(
        String dialogflowParticipantName,
        String obfuscatedExternalUserId,
        String role,
        String userId) {
        this.dialogflowParticipantName = Objects.requireNonNull(dialogflowParticipantName, "expected parameter 'dialogflowParticipantName' to be non-null");
        this.obfuscatedExternalUserId = Objects.requireNonNull(obfuscatedExternalUserId, "expected parameter 'obfuscatedExternalUserId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1ConversationParticipantResponse() {
        this.dialogflowParticipantName = null;
        this.obfuscatedExternalUserId = null;
        this.role = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dialogflowParticipantName;
        private String obfuscatedExternalUserId;
        private String role;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1ConversationParticipantResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dialogflowParticipantName = defaults.dialogflowParticipantName;
    	      this.obfuscatedExternalUserId = defaults.obfuscatedExternalUserId;
    	      this.role = defaults.role;
    	      this.userId = defaults.userId;
        }

        public Builder dialogflowParticipantName(String dialogflowParticipantName) {
            this.dialogflowParticipantName = Objects.requireNonNull(dialogflowParticipantName);
            return this;
        }
        public Builder obfuscatedExternalUserId(String obfuscatedExternalUserId) {
            this.obfuscatedExternalUserId = Objects.requireNonNull(obfuscatedExternalUserId);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public GoogleCloudContactcenterinsightsV1ConversationParticipantResponse build() {
            return new GoogleCloudContactcenterinsightsV1ConversationParticipantResponse(dialogflowParticipantName, obfuscatedExternalUserId, role, userId);
        }
    }
}
